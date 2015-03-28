var game = new Phaser.Game(500,409, Phaser.AUTO, 'gameDiv')
var mainState = {

    preload: function() { 
         game.stage.backgroundColor = '#65c357'
         game.load.image('bird', 'assets/bird.png')
         //game.load.image('bird2', 'assets/bird2.png')
         game.load.image('pipe', 'assets/pipe.png')
         game.load.audio('jump', 'assets/jump.wav')
         game.load.audio('pop', 'assets/pop.wav')
    },

    create: function() { 
        
        game.physics.startSystem(Phaser.Physics.ARCADE)
        this.bird = this.game.add.sprite(25, 245, 'bird')
         this.bird.anchor.setTo(-0.2, 0.5)
        game.physics.arcade.enable(this.bird)
        this.bird.body.gravity.y = 1000
        
        //var spaceKey = this.game.input.keyboard.addKey(Phaser.Keyboard.SPACEBAR)
        //spaceKey.onDown.add(this.jump, this)

        this.pipes = game.add.group()  
        this.pipes.enableBody = true
        this.pipes.createMultiple(20, 'pipe')
        this.timer = game.time.events.loop(1500, this.addRowOfPipes, this)
        
        

        this.score = 0;  
        this.labelScore = game.add.text(20, 20, "0", { font: "30px Comic Sans MS", fill: "#000000" })
        this.jumpSound = game.add.audio('jump')
        this.dieSound = game.add.audio('pop')
    },

    update: function() {
        if(this.game.input.activePointer.isDown)this.jump()
         if (this.bird.inWorld == false)
            {
                this.restartGame()
            }
        game.physics.arcade.overlap(this.bird, this.pipes, this.hitPipe, null, this)
        if (this.bird.angle < 20)  this.bird.angle += 1
    },
    jump: function() { 
    if (this.bird.alive == false)  return;  
         this.bird.body.velocity.y = -300;
        game.add.tween(this.bird).to({angle: -20}, 100).start()
        
        this.jumpSound.play();    
    },

    restartGame: function() {
        game.state.start('main');
},
    addOnePipe: function(x, y) {  
    
    var pipe = this.pipes.getFirstDead();
    pipe.reset(x, y);
    pipe.body.velocity.x = -200; 

    pipe.checkWorldBounds = true;
  
    pipe.outOfBoundsKill = true;
},
    addRowOfPipes: function() {

    this.score += 1;  
    this.labelScore.text = this.score;  
    
    var hole = Math.floor(Math.random() * 5) + 1
    for (var i = 0; i < 8; i++)
        if (i != hole && i != hole + 1) 
            this.addOnePipe(400, i * 60 + 10);   
},
hitPipe: function() {  
  
    if (this.bird.alive == false)
        return;

    this.bird.alive = false;
    this.dieSound.play()

    game.time.events.remove(this.timer);
    game.add.tween(this.bird).to({angle: -272}, 500).start()

  this.pipes.forEachAlive(function(p){
        p.body.velocity.x = 0;
    }, this);
},

};


game.state.add('main', mainState);  

game.state.start('main');  