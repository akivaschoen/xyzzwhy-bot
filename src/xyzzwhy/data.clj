(ns xyzzwhy.data)

(def events
  [{:text :location-event}
   {:text :action-event}])

(def location-events
  [{:text "You have entered {:class :location :config [:no-prep]}."}
   {:text "You try to go {:class :direction} but your way is blocked by {:class :obstacle}."}
   {:text "You try to go {:class :direction} but your way is blocked by {:class :obstacle}."}
   {:text "You try to go {:class :direction} but your way is blocked by {:class :obstacle}."}
   {:text "You try to go {:class :direction} but your way is blocked by {:class :obstacle}."}
   {:text "You try to go {:class :direction} but your way is blocked because reasons."}
   {:text "You go {:class :direction} and find yourself at {:class :location :config [:no-prep]}."}
   {:text "You go {:class :direction} and emerge {:class :location}."}
   {:text "You walk {:class :direction} and arrive at {:class :location :config [:no-prep]}."}
   {:text "You head {:class :direction} and arrive at {:class :location :config [:no-prep]}."}
   {:text "Hey! It's {:class :location :config [:no-prep]}."}
   {:text "You are {:class :location}."}
   {:text "You are {:class :location}."}
   {:text "You are {:class :location}."}
   {:text "You're {:class :location}."}
   {:text "You're {:class :location}."}
   {:text "You tunnel through the soil and pop up {:class :location}."}
   {:text "You emerge {:class :location}."}
   {:text "You arrive {:class :location}."}
   {:text "You are magically teleported to {:class :location}!"}
   {:text "The drugs are wearing off. You are {:class :location}."}
   {:text "The spell effects are wearing off. You are {:class :location}."}
   {:text "You are standing {:class :direction} of {:class :location :config [:no-prep]}."}
   {:text "You stumble into {:class :location :config [:no-prep]}."}
   {:text "You come across {:class :location :config [:no-prep]}."}
   {:text "You wake up from an odd dream. You are {:class :location}."}
   {:text "You open the secret door only to see {:class :location :config [:no-prep]}."}
   {:text "You find yourself {:class :location}."}
   {:text "During the shoot-out, you make your escape to {:class :location :config [:no-prep]}."}
   {:text "You start doing the worm until you find yourself {:class :location}."}
   {:text "You wake up {:class :location}."}
   {:text "You climb down a tree and find yourself {:class :location}."}
   {:text "You climb up a tree and find yourself {:class :location}."}
   {:text "The taxi driver randomly drops you off {:class :location}."}
   {:text "The metro bus unceremoniously dumps you {:class :location}."}
   {:text "The fog clears and you find yourself {:class :location}."}
   {:text "Your parachute gently plops you {:class :location}."}
   {:text "You jump out of a moving car, roll down a hill, and find yourself {:class :location}."}
   {:text "After walking for a long time, you find yourself {:class :location}."}
   {:text "You find your way blindly and end up {:class :location}."}
   {:text "No matter how hard you try, you still end up {:class :location}."}
   {:text "You climb out of the treasure chest. You are now {:class :location}."}
   {:text "You come to {:class :location}."}
   {:text "You follow a winding path only to find yourself {:class :location}."}
   {:text "You follow a sloping path. You find yourself {:class :location}."}
   {:text "You climb up a flight of stairs. You are now {:class :location}."}
   {:text "You shuffle down a flight of stairs and enter {:class :location :config [:no-prep]}."}
   {:text "The elevator doors open to reveal {:class :location :config [:no-prep]}."}
   {:text "Using a vine to swing across the pit, you land {:class :location}."}
   {:text "The trapdoor drops open beneath you and you land {:class :location}."}
   {:text "You step through the magic mirror and end up {:class :location}."}
   {:text "You get tangled up in a revolving door. You stumble out into {:class :location :config [:no-prep]}."}
   {:text "After scrambling through some dense underbrush, you find yourself {:class :location}."}
   {:text "After pushing your way through a dense crowd, you arrive {:class :location}."}
   {:text "You squeeze out of the sewage outflow and tumble into {:class :location :config [:no-prep]}."}
   {:text "You fall down a flight of stairs. You are now {:class :location}."}
   {:text "A tornado deposits you {:class :location}."}
   {:text "Right on cue, you pop up out of the jack-in-the-box. You're {:class :location}."}
   {:text "After being shot out of a cannon, you land {:class :location}."}
   {:text "You slide down the fireman's pole and land {:class :location}."}
   {:text "Hands on your hips, you survey {:class :location :config [:no-prep]} {:class :adverb}."}])
;   {:text "You have reached a dead-end. You start moonwalking away."}])

(def action-events
  [{:text "You awake from a nightmare. You saw yourself {:class :location}. The corpse of {:class :person} was there, holding {:class :item}."}
   {:text "You grab {:class :item}, hoping {:class :person} doesn't notice."}
   {:text "You pick up {:class :item}."}
   {:text "You pick up {:class :item} and hold it close to your chest."}
   {:text "The radio crackles to life. 'Mayday, mayday, it's {:class :person} calling. We're in trouble. We need assistance. Mayday, mayday.'"}
   {:text "The radio crackles to life. It sounds like someone with a cold is eating Rice Krispies."}
   {:text "The radio crackles to life. It's {:class :person} singing American Pie."}
   {:text "The radio crackles to life. It's {:class :person} singing Closer, repeating only the chorus for some reason."}
   {:text "The radio crackles to life. It's {:class :person} doing an advertisement for Soylent."}
   {:text "The radio crackles to life. It's {:class :person} doing an advertisement for Duff's."}
   {:text "The radio crackles to life. It's {:class :person} doing an advertisement for Slurm."}
   {:text "{:class :actor} drops {:class :item}, looks at you {:class :adverb}, then leaves."}
   {:text "{:class :actor} gently places {:class :item} on the ground and then backs away slowly."}
   {:text "Suddenly, {:class :actor} {:class :action} you."}
   {:text "{:class :actor} {:class :action} {:class :actor}."}
   {:text "{:class :actor} {:class :action} you."}
   {:text "{:class :actor} drops {:class :item} here."}
   {:text "{:class :actor} does a little jig. 'Bidibidibidi, wanna dance?'"}
   {:text "{:class :person} marches up to you and says, 'Hello please.'"}
   {:text "{:class :person} starts breakdancing and won't stop no matter how much you scream."}
   {:text "{:class :actor} attacks you and knocks you out! You awake sometime later {:class :location}."}
   {:text "{:class :person} appears in a puff of smoke and shouts, 'You will never see your {:class :item :config [:no-prep :no-article]} again!'"}
   {:text "You startle {:class :person} who drops {:class :item} and runs away."}
   {:text "{:class :person} slams down a half-empty glass of {:class :drink :config [:no-prep :no-article]}. 'All this nonsense about {:class :item} needs to stop! I can't take it anymore!'"}
   {:text "{:class :person} slams down a half-empty glass of {:class :drink :config [:no-prep :no-article]}. 'They're making plans for Nigel! They want what's best for him!'"}
   {:text "{:class :person} slams down a half-empty glass of {:class :drink :config [:no-prep :no-article]}. 'You can't go up against city hall!'"}
   {:text "{:class :person} slams down a half-empty glass of {:class :drink :config [:no-prep :no-article]}. 'I just can't take you seriously anymore!'"}
   {:text "{:class :person} suddenly shrieks."}
   {:text "{:class :person} makes a rude noise, points surreptitiously to {:class :animal} nearby."}
   {:text "You get tired of waiting for your Uber and decide to walk to {:class :location :config [:no-prep]} instead."}
   {:text "You get tired of waiting for your private jet so you decide to walk to {:class :location :config [:no-prep]} instead."}
   {:text "You get tired of waiting for the all-you-can-eat-buffet to open so you walk to {:class :location :config [:no-prep]} instead."}
   {:text "The phone rings. {:class :person} stares at it {:class :adverb}. Eventually the ringing stops."}
   {:text "The phone rings. {:class :person} watches as it starts to melt, the sound of the ring slowing and burbling to a stop."}
   {:text "The phone rings. {:class :person} picks it up, listens a moment, shrieks, and slams the phone down again."}
   {:text "You start eating {:class :food} and don't stop until you're done."}
   {:text "You eat {:class :food}."}
   {:text "You eat {:class :food}. {:class :actor} looks on {:class :adverb}."}
   {:text "You think to yourself, '{:class :thought}'"}
   {:text "You think to yourself, '{:class :thought}'"}
   {:text "You pause and think, '{:class :thought}'"}
   {:text "You feel a little famished so you eat {:class :food}."}
   {:text "You take a sip of {:class :drink :config [:no-article]}."}
   {:text "You check your inventory. You are empty-handed."}
   {:text "You check your inventory. You are carrying {:class :item}, {:class :item}, and {:class :item}."}
   {:text "You check your inventory. You have {:class :item} and {:class :item}."}
;   {:text "You open up {:class :book}. Someone has scribbled all over the margins. You throw it down on the floor in disgust."}
;   {:text "You open up {:class :book}. Someone has left a recipe for beef stew inside."}
;   {:text "You open up {:class :book}. You read a bit before tossing it over your shoulder and then doing the electric slide."}
   {:text "{:class :actor} suddenly appears out of the shadows, hisses at you, then scrambles away like a spider."}
   {:text "{:class :actor} suddenly appears out of the shadows, says, 'Oh, sorry about that,' then retreats back into the shadows."}
   {:text "{:class :actor} suddenly appears out of the shadows, says, '{:class :actor} will see you now,' then slowly retreats back into the shadows."}
   {:text "{:class :actor} picks up {:class :item}."}
   {:text "An overhead loudspeaker crackles to life, 'Citizen! Report immediately to the nearest self-incrimination booth.'"}
   {:text "An overhead loudspeaker crackles to life, 'Citizen! Report immediately to the bean simulator.'"}
   {:text "An overhead loudspeaker crackles to life, 'Citizen! Report immediately to the nearest certified manhole.'"}
   {:text "An overhead loudspeaker crackles to life, 'Citizen! Report immediately to the National Baby Oil Slip-n-Slide.'"}
   {:text "An overhead loudspeaker crackles to life, 'Citizen! Report immediately to the Hall of Uncomfortable Touching.'"}
   {:text "An overhead loudspeaker crackles to life, 'Citizen! Stop that.'"}
   {:text "An overhead loudspeaker crackles to life, 'Citizen! Report immediately to the Readers' Digest Condensation Camp.'"}
   {:text "An overhead loudspeaker crackles to life, 'Citizen! Report immediately to the Out-of-Control Rototiller Museum.'"}
   {:text "An overhead loudspeaker crackles to life, 'Citizen! Report immediately to the nearest mandatory prison hug.'"}
   {:text "An overhead loudspeaker crackles to life. The announcement is completely garbled. The loudspeaker switches off with a squawk."}
   {:text "An overhead loudspeaker crackles to life, 'Citizen! Report immediately to the nearest sanctioned dogpile.'"}
   {:text "An overhead loudspeaker crackles to life, 'Citizen! Report immediately to the nearest full-contact Bible study group.'"}
   {:text "An overhead loudspeaker crackles to life, 'Citizen! Report immediately to the mannequin factory.'"}
   {:text "An overhead loudspeaker crackles to life, 'Citizen! Report immediately to The Garbagerie.'"}
   {:text "An overhead loudspeaker crackles to life, 'Citizen! Report immediately to Stall #3.'"}
   {:text "An overhead loudspeaker crackles to life, 'Citizen! Just shut up already.'"}
   {:text "You start spinning around and around. {:class :person} looks unimpressed."}
   {:text "You start spinning around and around. {:class :person} faints."}
   {:text "You start spinning around and around. You drill straight into the crust of the earth."}
   {:text "You start spinning around and around. You gracefully lift off into a blue sky."}
   {:text "You start spinning around and around. You gracefully lift off into a blue sky never to be seen again."}
   {:text "You start spinning around and around. You gracefully lift off, go sideways, and crash into a building."}
;   {:text "You start spinning around and around while {:class :person} claps and cheers."}
   {:text "You start spinning around and around while {:class :person} cries and points."}
   {:text "You start spinning around and around while {:class :person} writes furiously on a clipboard."}
   {:text "You start spinning around and around while {:class :person} beams with pride."}
   {:text "{:class :person} is calling from {:class :location :config [:no-prep]} asking for {:class :item}."}
   {:text "{:class :person} is calling from {:class :location :config [:no-prep]} asking if {:class :person} can come out and play."}
   {:text "You peek out the window. {:class :person} is messing around with your mailbox. You crouch in fear."}
   {:text "You peek out the window. {:class :person} is laying facedown in your flowerbed. You sink to your knees with worry."}
   {:text "You peek out the window. {:class :person} has set up a lemonade stand in your yard. It's on fire."}
   {:text "You peek out the window. {:class :person} has set up a lemonade stand in your yard. It's covered in bees."}
   {:text "You peek out the window. {:class :person} has set up a lemonade stand in your yard. The line stretches around the block."}
   {:text "You peek out the window. {:class :person} has set up a lemonade stand across the street. You feel oddly jealous."}
   {:text "You peek out the window. {:class :person} is struggling to start a chainsaw while staring at you. You bite your knuckle."}
   {:text "You peek out the window. {:class :person} is standing in your yard, painting a portrait of you peeking out the window."}
   {:text "You peek out the window. Your entire house has been encased in a giant stone column."}
;   {:text "In the distance, you hear {:class :person} let the bass drop."}
;   {:text "In the distance, you hear {:class :person} drop the mic."}
;   {:text "In the distance, you hear {:class :person} get wicked."}
   {:text "With a knowing smile, @clive logs into Admiral Krag."}
   {:text "With a look of terror, @clive logs into Admiral Krag."}
   {:text "With a look of grim joy, @clive logs into Admiral Krag."}
   {:text "You check your health: you are {:class :diagnose}."}])

(def secondary-events 
  [{:text "You see {:class :item} here."}
   {:text "You see {:class :item} here. It looks oddly familiar."}
   {:text "There is {:class :item} here."}
   {:text "You pick up {:class :item}. It's covered in dust."}
   {:text "You pick up {:class :item}."}
   {:text "You drop {:class :item}."}
   {:text "You drop {:class :item}. It bursts into flames."}
   {:text "You drop {:class :item} here. It turns into a wisp of smoke."}
   {:text "You find {:class :item} here. You back away {:class :adjective}."}
   {:text "{:class :actor} is here."}
   {:text "{:class :actor} is here {:class :actor-action}"}
   {:text "{:class :actor} is here {:class :actor-action}"}
   {:text "You find {:class :actor} {:class :actor-action}"}
   {:text "You find {:class :actor} {:class :actor-action}"}
   {:text "{:class :person} {:class :dialogue}"}
   {:text "{:class :person} {:class :dialogue}"}
   {:text "{:class :person} {:class :dialogue}"}
   {:text "{:class :person} {:class :dialogue}"}
   {:text "{:class :person} {:class :dialogue}"}
   {:text "{:class :actor} is here searching for {:class :item}."}
   {:text "{:class :actor} is here with {:class :actor}. They look {:class :adjective}."}
   {:text "{:class :actor} follows you."}
   {:text "{:class :actor} slinks up behind you."}
   {:text "{:class :actor} wanders by, playing a recorder."}
   {:text "{:class :actor} wanders by, jamming on a mouth organ."}
   {:text "{:class :actor} wanders by, whistling the theme to the Andy Griffith Show."}
   {:text "{:class :actor} wanders by, whistling the theme to the Garry Shandling Show."}
   {:text "A hollow voice intones, '{:class :intonation}'"}
   {:text "A hollow voice intones, '{:class :intonation}'"}
   {:text "A hollow voice intones, '{:class :intonation}'"}
   {:text "A hollow voice intones, '{:class :intonation}'"}
   {:text "Something smells {:class :scent} here."}
   {:text "It smells {:class :scent}."}
   {:text "It smells {:class :scent}."}
   {:text "It smells {:class :scent}."}
   {:text "You hear {:class :noise} in the distance."}
   {:text "You hear the sound of {:class :noise} nearby."}
   {:text "The wind howls in the distance."}
   {:text "It appears abandoned."}
   {:text "Someone has been here recently."}
   {:text "There are fresh footprints here."}
   {:text "It seems that no one has been here for a long time."}
   {:text "Someone has attached marionnette wires to your hands, feet, and head."}
   {:text "Someone has left a running bulldozer here."}
   {:text "The words 'eat dulp' are spray-painted on a wall here."}
   {:text "The words 'Knifekitten lives!' are spray-painted on a wall here."}
   {:text "The words 'Hammerdog lives!' are spray-painted on a wall here."}
   {:text "Spray-painted on the wall here are the words 'Alice?! Alice?! Who the f...'. The rest is illegible."}
   {:text "There has been significant damage from {:class :disaster}."}
   {:text "You see a sign here. On it is written '{:class :sign}'"}
   {:text "You see a sign here. On it is written '{:class :sign}'"}])

(def tertiary-events 
  [{:text "You aren't wearing any clothes."}
   {:text "Your clothes feel too small."}
   {:text "Your clothes feel too loose."}
   {:text "You're certain these aren't your clothes."}
   {:text "Your shoes are on the wrong feet."}
   {:text "Your tie feels uneven."}
   {:text "You're wearing two bowties for some reason."}
   {:text "You're not wearing any underwear."}
   {:text "You're wearing two pairs of underwear."}
   {:text "Someone is struggling with warped Tupperware nearby."}
   {:text "You do a little jig and then whistle."}
   {:text "You clap once."}
   {:text "You have socks on your hands."}
   {:text "You slowly slide your hands into your pockets. You regret this immediately."}
   {:text "You feel serene."}
   {:text "You feel nervous."}
   {:text "You feel anxious."}
   {:text "You feel cold."}
   {:text "You feel warm."}
   {:text "You aren't alone."}
   {:text "You blink really slowly."}
   {:text "You find yourself humming the theme to Too Many Cooks."}
   {:text "You hear gunfire in the distance."}
   {:text "You hear a party in the distance."}
   {:text "You hear a toilet flush nearby."}
   {:text "Someone is having fun against their will nearby."}
   {:text "You yawn."}
   {:text "You sneeze."}
   {:text "You cough."}
   {:text "You chuckle to yourself."}
   {:text "You practice frowning for awhile."}
   {:text "You begin to smile uncontrollably."}
   {:text "You wish you had your grandpappy's harmonica."}
   {:text "You are starting to feel sleepy."}
   {:text "You glance at your watch; you're running 15 minutes late."}
   {:text "You glance at your watch; somehow, you're still on time."}
   {:text "You glance at your watch; you're a little ahead of schedule."}
   {:text "You spend a few moments thinking fondly about your teeth."}
   {:text "You have rope burns on your wrists... but from where?"}
   {:text "You feel as if you're being followed."}
   {:text "A warm breeze blows by."}
   {:text "A cool breeze blows by."}
   {:text "It starts to rain."}
   {:text "It starts to snow."}
   {:text "Thunder coughs gently in the distance."}
   {:text "A basketball bounces by."}
   {:text "Something nearby is on fire."}
   {:text "You can smell something burning in the distance."}
   {:text "You look around nervously."}
   {:text "You spot a balloon stuck in a tree."}
   {:text "You spot a kitten stuck in a tree."}
   {:text "You spot an office desk in a tree."}
   {:text "You see a pair of sneakers dangling on a utility line overhead."}
   {:text "Someone nearby is repeatedly zipping and unzipping a duffel bag."}
   {:text "Somehow, you've lost your {:class :garment :config [:no-article]}."}
   {:text "You hear someone nearby typing away on a manual typewriter."}
   {:text "You're catching your second wind."}
   {:text "You are starting to feel thirsty."}
   {:text "You feel better."}
   {:text "You are starting to feel hungry."}])

(def actor-actions
  [{:text "looking {:class :adjective}."}
   {:text "being chased by a swarm of balloon animals."}
   {:text "being chased by {:class :person}."}
   {:text "being chased by {:class :item} which is attached to them by a string."}
   {:text "dancing furiously."}
   {:text "dancing extremely slowly."}
   {:text "shouting at an imaginary helicopter."}
   {:text "doing the Kenosha Kid."}
   {:text "thinking {:class :adverb} about {:class :actor}."}
   {:text "being chased around by a bee."}
   {:text "defiantly eating Scrabble tiles, one by one."}
   {:text "{:class :adverb} playing the organ."}
   {:text "organizing matches."}
   {:text "having a Guru Meditation Error."}
   {:text "juggling some balls."}
   {:text "dancing in a little circle."}
   {:text "stooping up and down like a rapper in concert."}
   {:text "drooling uncontrollably."}
   {:text "clutching a DVD of Dot & the Kangaroo."}
   {:text "clutching a DVD of BMX Bandits."}
   {:text "wearing an eyepatch."}
   {:text "wearing two eyepatches and stumbling around blindly."}
   {:text "hiding under a table."}
   {:text "hiding under a sofa."}
   {:text "hiding in the bushes."}
   {:text "munching on {:class :food}."}
   {:text "pretending to be invisible."}
   {:text "having a coughing fit."}
   {:text "having a sneezing fit."}
   {:text "being menaced by {:class :animal}."}
   {:text "ready to start some shit."}
   {:text "examining {:class :item} with great confusion."}])

(def locations
  [{:text "dead-end"
    :type :interior
    :article "a"
    :preps ["at" "in front of"]
    :descriptions ["You start to moonwalk away."
                   "Someone has painted a giant sad face here."]}
  
   {:text "tire fire" 
    :type :exterior
    :article "a" 
    :preps ["at" "near" "behind" "in front of"]
    :descriptions ["It is warm and welcoming."
                   "Someone had been roasting marshmallows here."
                   "The air here is black with despair and entropy."
                   "The sky is darkened by the hellish smoke of the endless burn."
                   "These tires are no longer the things on your car that make contact with the road."]}
   
   {:text "dildo bonfire" 
    :type :exterior
    :article "a" 
    :preps ["at" "near" "behind" "in front of"]
    :descriptions ["You look closely but don't recognize any of them."
                   "The plastic hisses and creaks in the blaze."
                   "Someone has piled up a collection of pleasuring devices, now ablaze."
                   "Surely there had to hae been a better way to punish these plastic torpedos."
                   "The air is dense with the echoes of unreached orgasms and epic frustrations."]}

   {:text "hot tub"
    :type :interior
    :article "a"
    :preps ["in near"]
    :descriptions ["The water roils and steams like water roils and steams."
                   "Someone has put blue coloring into the water. It looks like the future." 
                   "It smells delicious because someone filled it with chicken soup." ]}

   {:text "maze of twisty little passages, all alike"
    :type :interior
    :article "a"
    :preps ["in"]}

   {:text "Burning Man"
    :type :exterior
    :preps ["at"]
    :descriptions ["Oddly, no one appears to be here."
                   "A tumbleweed made out of human hair stumbles by."
                   "A dust storm is approaching."
                   "It looks like it might rain soon."
                   "Clearly the drugs have begun to take hold."]}

   {:text "Shrim Healing Center"
    :type :exterior
    :article "a"
    :preps ["in" "at" "in front of" "behind"]
    :descriptions ["In the store window is an array of old television sets, all blackly inert."
                   "Someone has spray-painted 'I crave brown baths' here."
                   "From somewhere within the building, you hear the sound of repulsed joy."
                   "The building looks like it has been condemned. The door is boarded up."]}

   {:text "quicksand"
    :type :exterior
    :article "some"
    :preps ["in" "near"]
    :descriptions ["Briefly, you see a fin rise up and cruise back and forth."
                   "The surface of the quicksand gently sways, beckoning you..."
                   "Oddly, this quicksand smells like freshly cooked oatmeal."]}

   {:text "swimming pool" 
    :type :exterior
    :article "a"
    :preps ["in" "at" "near"]
    :descriptions ["The surface of the pool is almost entirely still. You are afraid to disturb it."
                   "The water has turned slightly murky; it does not look inviting."
                   "The surface of the pool is littered with leaves."
                   "An abandoned plastic float with a dinosaur's head floats lonely nearby."]}

   {:text "sauna" 
    :type :interior
    :article "a" 
    :preps ["in" "near"]
    :descriptions ["The wood paneling sweats sweetly in the oppressive heat."
                   "Great thunderheads of steam rise up from the rock basin, making it hard to see."
                   "The room is cold and dark. No one has used this sauna in years."]} 
   
   {:text "New York Public Library" 
    :type :exterior
    :article "the"
    :preps ["at" "near" "behind" "in front of"]}

   {:text "ravine" 
    :type :exterior
    :article "a" 
    :preps ["in"]
    :descriptions ["It stretches out in front of you, meandering as if drunk."
                   "It has been nearly choked to death by an avalanche at the north end."
                   "The walls of the ravine are treacherous. A trickle of water flows fitfully below."]}

   {:text "ditch" 
    :type :exterior
    :article "a" 
    :preps ["in"]
    :descriptions ["The dusty stench of aged sewage rises up like a stomach-crushing wraith."
                  "It is completely blocked here by a giant boulder. But how did it get here?"
                  "A trickle of clear water runs down the middle of it."]}

   {:text "dump" 
    :type :exterior
    :article "the"
    :preps ["at" "near" "behind" "in front of"]
    :descriptions ["In the distance, you see women searching through spires of rubbish for treasure."
                   "The hill of trash shifts dangerously beneath your feet."
                   "The mounds of garbage stretch off into the distant, murky haze."]}

   {:text "dump truck" 
    :type :exterior
    :article "a"
    :preps ["in" "near" "behind" "in front of" "underneath"]
    :descriptions ["It's covered with a patina of black filth and oily washes of grime."
                   "Fresh off the line, this dump truck is gleaming with clean red paint."
                   "The engine is rumbling roughly to itself. Both of the doors are locked."]}

   {:text "Starbucks" 
    :type :exterior
    :article "a"
    :preps ["in" "near" "behind" "in front of"]
    :descriptions ["It is packed tightly with hipsters."
                   "There is a surprising lack of hipsters here."
                   "It reeks of slightly burnt coffee here."]}

   {:text "park restroom stall" 
    :type :interior
    :article "a"
    :preps ["in"]
    :descriptions ["The door has been torn off its hinges and the walls are covered with violent scratches."
                   "Unfortunately, the toilet recently vomited up at least five gallons of excrement and dreams."
                   "You feel a sense of deja vu."
                   "You whisper to yourself, 'Home again, home again, jiggity jig.'"
                   "The lingering scents of lemon and Lysol haunt the air here."
                   "Someone has scratched your name and phone number above the toilet paper dispenser."]}

   {:text "all-you-can-eat buffet" 
    :type :interior
    :article "an"
    :preps ["at"]
    :descriptions ["It is a grid of delicious choices, all unhealthy, all alluring."
                   "Steam crowds the air."
                   "There is a dizzying array of gluten-free, vegan choices. You leave immediately."
                   "It looks abandoned."
                   "It smells of freedom and gluttony."
                   "All of the food has been replaced with wax replicas."
                   "It's in complete disarray and hasn't been tended for some time."]}

   {:text "grotto" 
    :type :exterior
    :article "a"
    :preps ["in" "near" "behind" "in front of"]
    :descriptions ["The ceiling is sparkling with light reflected from the blue-green pool below."
                   "The water is darkened with greenish-gray algae. There's a foul odor here."
                   "The pool of water seems unusually deep. A lean, black fish swims in a circle."]}

   {:text "bedroom" 
    :type :interior
    :article "your"
    :preps ["in"]
    :descriptions ["It hasn't been cleaned in a long time. There's a pleasantly disgusting smell here."
                   "It's small and lightly furnished. The bed is unmade. Has someone been sleeping here?"
                   "There is nothing special about it."
                   "You notice an unusual stain in the carpet."
                   "You notice an unusual stain in the carpet next to a usual stain. So it goes."
                   "It's a typical bedroom. There's a pile of laundry in one corner and a computer desk in the other."] }

   {:text "McDonald's" 
    :type :exterior
    :article "a"
    :preps ["at" "in" "near" "behind" "in front of"]}

   {:text "White Castle" 
    :type :exterior
    :article "a"
    :preps ["at" "in" "near" "behind" "in front of"]
    :descriptions ["It's white and vaguely castle-shaped."]}

   {:text "Taco Bell" 
    :type :exterior
    :article "a"
    :preps ["at" "in" "near" "behind" "in front of"]}

   {:text "dark area" 
    :type :interior
    :article "a"
    :preps ["in"]
    :descriptions ["It is pitch black here. You're likely to be eaten by {:class :actor}."
                   "It's really dark here. Like... REALLY dark."
                   "It's dark here. DARK AS YOUR SOUL."]}

   {:text "breezy cave" 
    :type :exterior
    :article "a"
    :preps ["in" "near" "in front of"]
    :descriptions ["There's a constant breeze rising up from the depths."
                  "Wide and low, the cave gently slopes {:class :direction}-{:class :direction} here."
                  "Here it winds up precariously. The cave seems to be breathing rapidly."]}

   {:text "forest" 
    :type :exterior
    :article "a"
    :preps ["in" "near" "in front of"]
    :descriptions ["It is a dense, dark, and tangled choke of gnarled trees, thorny underbrush, and spiky thickets."
                   "Shot through with shafts of light, the forest before you looks serene."
                   "The trees, mostly oak and spruce, sway gently in the occasional breeze."
                   "Birds are chirping and rodents scamper through the underbrush."]}

   {:text "riverbed" 
    :type :exterior
    :article "a"
    :preps ["in" "near"]
    :descriptions ["The shallow expanse is dry as a bone and littered with rocks and branches."
                   "Here is a shallow channel through which brackish water flows fitfully."
                   "It's mostly dry, the flow of the water blocked by a beaver dams upstream."]}
   
   {:text "AT&T Store" 
    :type :exterior
    :article "an"
    :preps ["at" "in" "near" "behind" "in front of"]}

   {:text "Apple Store" 
    :type :exterior
    :article "an"
    :preps ["at" "in" "near" "behind" "in front of"]}

   {:text "ballpit" 
    :type :interior
    :article "a"
    :preps ["in" "near"]
    :descriptions ["Oddly, all of the balls here are the same color: orange."
                   "The ballpit seems unusually deep. You can't feel the bottom."
                   "You aren't certain but all clues point to there being someone or something lurking in there."]}

   {:text "airplane" 
    :type :interior
    :article "an"
    :preps ["in"]
    :descriptions ["There's no one else on board."
                   "You hear strange noises coming from the restroom."
                   "Somehow you have a dozen packets of pretzels."
                   "Someone drank your Fresca while you were napping."
                   "It's pitch black outside. Can grues fly?"
                   "The pilot says, 'We've reached our cruising altitude of 30 feet.'"
                   "The plane has been going straight up for hours now."]}

   {:text "trunk of a car" 
    :type :interior
    :article "the"
    :preps ["in"]
    :descriptions ["It is well upholstered."
                   "A tire iron is digging into your back a little bit."
                   "There's a half-eaten bag of Bugles here."
                   "With all the trash in here, there's barely any room for you."
                   "It's pitch black. Not enough room for a grue in here, at least."]}

   {:text "coffin" 
    :type :interior
    :article "a"
    :preps ["in" "near" "in front of"]
    :descriptions ["It is well upholstered."
                   "It smells of cotton candy in here for some reason."
                   "It smells of Aquanet in here. Makes sense."
                   "It's pitch black. It probably doesn't matter if there are grues or not."]}

   {:text "hugbox"
    :type :interior
    :article "a"
    :preps ["in"]
    :descriptions ["You feel at home again."
                   "It's very warm in here. Perhaps too warm."
                   "It smells of stale sweat and lies, lies, lies..."]}

   {:text "haunted house" 
    :type :exterior
    :article "a"
    :preps ["at" "in" "near" "behind" "in front of"]
    :descriptions ["At the top of the hill, the house shrugs under its own entropy."
                   "An orange light wanders from window to window."
                   "The antebellum abode, white in its gaudy shame of elegance, has been overgrown by kudzu and rotting vines."]}

   {:text "graveyard" 
    :type :exterior
    :article "a"
    :preps ["at" "in" "near" "behind" "in front of"]
    :descriptions ["There is a freshly laid grave nearby."
                   "There is an open grave nearby. It's empty." 
                   "There is an open grave nearby. There's a phone book in it." 
                   "There is an open grave nearby. It's full of {:class :drink :config [:no-article]}."
                   "There are fresh footprints here."
                   "A lazy mist wanders aimlessly amongst the shifted tombstones. A cold light spills down from behind a tree."
                   "Long ago, the upright tombstones had been replaced by durable plastic bricks to minimize upkeep."
                   "You see a mausoleum here covered with dark green moss. It looks vaguely familiar."]}

   {:text "playground" 
    :type :exterior
    :article "a"
    :preps ["in" "near" "behind" "in front of"]
    :descriptions ["Freshly built, it looks like it has never been used. You see not a scratch or a ding on any of the equipment."
                   "Most of the equipment is missing or broken. In the distance, swings squeak loneliness in the slight breeze."
                   "A picnic table is nearby, burdened by a fresh birthday party except no one is around. Someone is turning 6 today... but who?"]}

   {:text "pile of diapers" 
    :type :exterior
    :article "a"
    :preps ["in" "near" "behind" "in front of" "underneath"]}

   {:text "meeting" 
    :type :interior
    :article "a"
    :preps ["in"]
    :descriptions ["The room is comically overwhelmed by tripod stands crowded with colorful charts."
                   "The room is empty. The projector is on, showing random photos of cats at play."
                   "The table is covered, end-to-end, by neat stacks of donuts of various heights."
                   "The chairs are all occupied by cobweb-encrusted skeletons."
                   "The room is almost full of balloons."]}

   {:text "Luby's" 
    :type :exterior
    :article "a"
    :preps ["at" "in" "near" "behind" "in front of"]}])

(def dialogues
  [{:text "asks, 'Have you ever seen an elephant throw up?'"}
   {:text "asks, 'Why am I holding this pitchfork?'"}
   {:text "asks, 'How long is a man?'"}
   {:text "asks, 'Where have you been?'"}
   {:text "asks, 'Would you like to see my collection of tiny ceiling fans?'"}
   {:text "asks, 'Which one are you?'"}
   {:text "asks, 'Can I have a hug?'"}
   {:text "asks, 'Are you following me?'"}
   {:text "asks, 'Does it smell like {:class :food} in here to you?'"}
   {:text "asks, 'Have you got a flag?'"}
   {:text "asks, 'Have you ever seen a grown man naked?'"}
   {:text "chants, 'It's time to pay the price.'"} 
   {:text "mumbles, 'You can't go up against city hall.'"}
   {:text "mumbles, 'One day I'm going to burn this place to the ground.'"}
   {:text "mumbles, 'Skrillex ruined it all for everybody.'"}
   {:text "mumbles, 'I've never been to Belize.'"}
   {:text "says, 'It's true: the boot is the best McNugget shape.'"}
   {:text "says, 'Wrong answer, chief.'"}
   {:text "says, 'This is giving me the freak-out.'"}
   {:text "says, 'How unfortunate.'"}
   {:text "says, 'I've been waiting for you.'"}
   {:text "says, 'I can't find my heirloom clown suit.'"}
   {:text "says, 'I can't find my {:class :garment :config [:no-article]}.'"}
   {:text "says, 'No money? No hamburger!'"}
   {:text "says, 'It's like drinking a meatloaf!'"}
   {:text "says, 'Took you long enough.'"}
   {:text "says, 'I'm addicted to Kitty Lick III.'"}
   {:text "says, 'Looks like I'm not having any mayonnaise.'"}
   {:text "says, 'I'm a brown-belt in speed tai chi.'"}
   {:text "says, 'I'm stuck in a poo loop.'"}
   {:text "says, 'Well, that's a dead give away.'"}
   {:text "says, 'If you asked me to have sex with you, I wouldn't say \"no\".'"}
   {:text "shouts, 'You can't go up against city hall!'"}
   {:text "shouts, 'You can't fold a cat!'"}
   {:text "shouts, 'They're having a brownout in Lagos!'"}
   {:text "shouts, 'Don Quixote! Swingin' from a pipe!'"}
   {:text "shrieks, 'What's this shit I keep hearing about erections?!'"}
   {:text "shrieks, 'I'm living on the edge!'"}
   {:text "shrieks, 'Boiled soil!'"}
   {:text "sighs, 'I liked you better before the hip-replacement surgery.'"}
   {:text "snarls, 'Siddown before ya fall down!'"}
   {:text "whispers, 'It puts the lotion on its skin...'"}
   {:text "whispers, 'I've always wanted to be a creepy uncle.'"}
   {:text "whispers, 'Fee was a Buddhist prodigy.'"}
   {:text "whispers, 'There squats the brown clown.'"}
   {:text "whispers, 'Sleep is unproductive and a waste of time.'"}
   {:text "whispers, 'You just lost the game.'"}])

(def thoughts
  [{:text "Why don't they put mayo in the can with the tuna?"}
   {:text "{:class :person} never has a second cup of coffee at home..."}
   {:text "You can't go up against city hall."}
   {:text "I've made a huge mistake."}
   {:text "It's time to pay the price."}
   {:text "It'll all end in tears."}
   {:text "But I didn't eat the mousse!"}
   {:text "{:class :person} still owes me a backrub."}
   {:text "I wonder if I could forge us a Group 6 Access..."}])

(def intonations
  [{:text "Toast goes in the toaster."}
   {:text "These pretzels are making me thirsty."}
   {:text "Wrong answer, chief."}
   {:text "For those who can make the journey, there is a place."}
   {:text "Slightly uncomfortable pleasures."}
   {:text "It is a winning cake."}
   {:text "POKE 1024,0"}
   {:text "Your pilikia is all pau."}
   {:text "The owls are not what they seem."}
   {:text "Plugh."}
   {:text "Zzyzx."}
   {:text "Guch."}
   {:text "Spigot."}
   {:text "You sank my battleship."}
   {:text "Sorry, but it couldn't be helped."}
   {:text "Clean up in aisle 8A."}
   {:text "Rabbit feces."}
   {:text "Consider deeply the baked ham."}
   {:text "You can't go up against city hall."}])

(def signs
  [{:text "Burma shave!"}
   {:text "It's time to pay the price."}
   {:text "You can't go up against city hall."}
   {:text "For those who can make the journey, there is a place."}
   {:text "Here lies Hammerdog, a dog made of hammers."}
   {:text "Here lies Knifekitten, a kitten made of knives."}
   {:text "When you're not reading this, it's written in Spanish."}
   {:text "Now you know how hard it is to say \"Irish wristwatch\"."}])

(def books
  [{:text "the Bible"
    :preps ["a copy of"]}

   {:text "Catcher in the Rye"
    :preps ["a copy of"]}

   {:text "Infinite Jest"
    :preps ["a copy of"]}

   {:text "Gravity's Rainbow"
    :preps ["a copy of"]}

   {:text "A Prayer for Owen Meany"
    :preps ["a copy of"]}

   {:text "The Hitchhiker's Guide to the Galaxy"
    :preps ["a copy of"]}])

(def directions
  [{:text "north"}
   {:text "northeast"}
   {:text "east"}
   {:text "southeast"}
   {:text "south"}
   {:text "southwest"}
   {:text "west"}
   {:text "northwest"}])

(def persons
  [{:text "Samuel L. Jackson"
    :gender :male}

   {:text "Lloyd Braun"
    :gender :male}

   {:text "David Lynch"
    :gender :male}

   {:text "Stephen Fry"
    :gender :male}

   {:text "Hugh Laurie"
    :gender :male}

   {:text "Stephen Colbert"
    :gender :male}

   {:text "Frances McDormand"
    :gender :female}

   {:text "Whoopi Goldberg"
    :gender :female}

   {:text "Katy Perry"
    :gender :female}

   {:text "Justin Bieber"
    :gender :male}

   {:text "Neil deGrasse Tyson"
    :gender :male}

   {:text "Tim Heidecker"
    :gender :male}

   {:text "Eric Wareheim"
    :gender :male}

   {:text "Jim J. Bullock"
    :gender :male}

   {:text "Johnny Cash"
    :gender :male}

   {:text "a police officer"}

   {:text "Alex Trebek"
    :gender :male}

   {:text "Craig Ferguson"
    :gender :male}

   {:text "Geoff Petersen"
    :gender :male}

   {:text "Nancy Grace"
    :gender :female}

   {:text "Lindsay Lohan"
    :gender :female}

   {:text "Ruth Buzzi"
    :gender :female}

   {:text "Jennifer Lawrence"
    :gender :female}

   {:text "Tilda Swinton"
    :gender :female}
   
   {:text "Peter Dinklage"
    :gender :male}

   {:text "Brad Pitt"
    :gender :male}

   {:text "Bill Maher"
    :gender :male}

   {:text "Grace Jones"
    :gender :female}

   {:text "Bill Murray"
    :gender :male}

   {:text "your mom"}

   {:text "a bunch of kids"}

   {:text "a crowd of Yoga enthusiasts"}

   {:text "George Clooney"
    :gender :male}

   {:text "James Franco"
    :gender :male}

   {:text "Jonah Hill"
    :gender :male}

   {:text "a gas station attendant"}

   {:text "Craig T. Nelson"
    :gender :male}

   {:text "Thomas Pynchon"
    :gender :male}

   {:text "Drew Olanoff"
    :gender :male}

   {:text "Louis Gray"
    :gender :male}

   {:text "@akiva"
    :gender :male}

   {:text "@veo_"
    :gender :male}

   {:text "@vmcny"
    :gender :male}

   {:text "@KamenPrime"
    :gender :male}

   {:text "@neonbubble"
    :gender :male}

   {:text "@micahwittman"
    :gender :male}

   {:text "@itafroma"
    :gender :male}

   {:text "@clive"
    :gender :male}

   {:text "@mokargas"
    :gender :male}

   {:text "Bob Sacamano"
    :gender :male}

   {:text "Zombie Hunter Thompson"
    :gender :male}

   {:text "Zombie Carl Sagan"
    :gender :male}])

(def actions
  [{:text "attacks"}
   {:text "sneezes on"}
   {:text "ignores"}
   {:text "tickles"}
   {:text "stands uncomfortably close to"}
   {:text "violently points at"}
   {:text "imitates"}
   {:text "pets"}
   {:text "examines"}
   {:text "flirts with"}])

(def adjectives
  [{:text "worried"}
   {:text "relieved"}
   {:text "aroused"}
   {:text "afraid"}
   {:text "nonplussed"}
   {:text "sleepy"}
   {:text "hungry"}
   {:text "thirsty"}
   {:text "bored"}
   {:text "hopeful"}
   {:text "sad"}
   {:text "happy"}
   {:text "forlorn"}
   {:text "angry"}])

(def adverbs
  [{:text "carefully"}
   {:text "wistfully"}
   {:text "uncertainly"}
   {:text "willfully"}
   {:text "lustfully"}
   {:text "warily"}
   {:text "solemnly"}
   {:text "mournfully"}
   {:text "haphazardly"}
   {:text "bravely"}
   {:text "sadly"}
   {:text "happily"}
   {:text "balefully"}])

(def scents
  [{:text "acrid"}
   {:text "sweet"}
   {:text "sour"}
   {:text "rotten"}
   {:text "nice"}
   {:text "foul"}
   {:text "of feet"}
   {:text "of your grandfather's hair cream"}
   {:text "of warm peanut butter"}
   {:text "bitter"}
   {:text "smoky"}
   {:text "gross"}
   {:text "pleasant"}])

(def diagnoses
  [{:text "feeling great"}
   {:text "feeling gross"}
   {:text "absurdly sticky"}
   {:text "lightly wounded"}
   {:text "moderately wounded"}
   {:text "heavily wounded"}
   {:text "near death"}
   {:text "sleepy"}
   {:text "drunk"}
   {:text "stoned"}
   {:text "confused"}
   {:text "hungry"}
   {:text "thirsty"}
   {:text "temporarily blind"}
   {:text "temporarily deaf"}
   {:text "covered in bees"}])

(def foods
  [{:text "burrito"
    :article "a"}
   
   {:text "bouquet of corndogs"
    :article "a"}
   
   {:text "corndog"
    :article "a"}
   
   {:text "pancakes"
    :article "some"}

   {:text "cake"
    :article "a"}
   
   {:text "cake"
    :article "a slice of"}

   {:text "kumquat"
    :article "a"}
   
   {:text "salad"
    :article "a"}

   {:text "Rice Chex"
    :article "a bowl of"}

   {:text "Reese's Peanut Butter Cup"
    :article "a"}

   {:text "apple pocket"
    :article "an"}

   {:text "block of cheese"
    :article "a"}

   {:text "wedge of cheese with some mold on it"
    :article "a"}

   {:text "slice of fried spam"
    :article "a"}

   {:text "delicious churro"
    :article "a"}

   {:text "chocolate bobka"
    :article "a"}
   
   {:text "sweetroll"
    :article "a"}
   
   {:text "Cinnabon"
    :article "a"}
   
   {:text "duck confit"
    :article "some"}
   
   {:text "pasta"
    :article "some"}
   
   {:text "uncooked rice"
    :article "some"}
   
   {:text "Fritos"
    :article "some"}
   
   {:text "sushi"
    :article "some"}

   {:text "apple cinnamon Pop Tart"
    :article "an"}])

(def drinks
  [{:text "steaming gravy"
    :article "a cup of"}
   
   {:text "milk"
    :article "a gallon of"}

   {:text "orange juice"
    :article "a glass of"}

   {:text "tea"
    :article "some"}

   {:text "soda"
    :article "some"}

   {:text "water"
    :article "some"}

   {:text "beef broth"
    :article "some"}

   {:text "scotch"
    :article "a"}])

(def garments
  [{:text "hat"
    :article "a"}
   
   {:text "pants"
    :article "some"}
   
   {:text "shirt"
    :article "a"}
   
   {:text "gloves"
    :article "some"}
   
   {:text "shoes"
    :article "some"}
   
   {:text "belt"
    :article "a"}
   
   {:text "socks"
    :article "some"}
   
   {:text "coat"
    :article "a"}
   
   {:text "jacket"
    :article "a"}
   
   {:text "underwear"
    :article "some"}
   
   {:text "dress"
    :article "a"}
   
   {:text "skirt"
    :article "a"}
   
   {:text "schizophrenic mood ring"
    :article "a"}
   
   {:text "sweater"
    :article "a"}
   
   {:text "watch"
    :article "a"}])

(def items
  [{:text "skinny jeans"
    :article "a pair of"}

   {:text "llama treats"
    :article "a bag of"}

   {:text "parachute pants"
    :article "a pair of"}

   {:text "Breakin' 2: Electric Boogaloo"
    :article "a Laserdisc copy of"}

   {:text "magic scroll"
    :article "a"}

   {:text "no tea"}

   {:text "Snausages"
    :article "some"}

   {:text "slide rule"
    :article "a"}

   {:text "pinecone"
    :article "a"}

   {:text "sweat-incrusted trilby"
    :article "a"}
   
   {:text "vitamins"
    :plural true
    :article "some"}
   
   {:text "bucket of corks"
    :article "a"}
   
   {:text "jean shorts"
    :article "a pair of"}
   
   {:text "non-Euclidian Lego"
    :article "a"}
   
   {:text "spray-on bacon"
    :article "a can of"}
   
   {:text "spackle"
    :article "a can of"}
   
   {:text "unfamiliar briefcase"
    :article "an"}
   
   {:text "towel from the Las Vegas Radisson"
    :article "a"}
   
   {:text "receipt from a bunny outfit rental"
    :article "a"}
   
   {:text "floppy disk"
    :article "a"}
   
   {:text "pencil"
    :article "a"}
   
   {:text "lantern"
    :article "a"}
   
   {:text "elven sword"
    :article "an"}
   
   {:text "books"
    :article "some"}
   
   {:text "movie ticket"
    :article "a"}
   
   {:text "newspaper"
    :article "a"}
   
   {:text "kitten"
    :article "a"}
   
   {:text "puppy"
    :article "a"}
   
   {:text "bag of potatoes"
    :article "a"}
   
   {:text "bag of rice"
    :article "a"}
   
   {:text "giant styrofoam peanut"
    :article "a"}
   
   {:text "phone book"
    :article "a"}
   
   {:text "pyramid of tennis balls"
    :article "a"}
   
   {:text "deflated soccer ball"
    :article "a"}
   
   {:text "fourth grade report card"
    :article "your"}
   
   {:text "half-eaten sandwich"
    :article "a"}
   
   {:text "signed photograph of Richard Moll"
    :article "a"}
   
   {:text "hipster t-shirt"
    :article "a"}
   
   {:text "pile of discarded puppets"
    :article "a"}
   
   {:text "wet Lincoln Log"
    :article "a"}
   
   {:text "VHS tape covered in blood"
    :article "a"}])

(def animals
  [{:text "kitten"
    :article "a"
    :sounds ["purrs" "meows" "growls"]
    :adjectives ["purring" "meowing" "growling"]}

   {:text "cat"
    :article "a"
    :sounds ["purrs" "meows" "growls"]
    :adjectives ["purring" "meowing" "growling"]}

   {:text "puppy"
    :article "a"
    :sounds ["pants" "barks" "growls" "whimpers"]
    :adjectives ["panting" "barking" "growling" "whimpering"]}

   {:text "duck"
    :article "a"
    :sounds ["quacks"]
    :adjectives ["quacking"]}

   {:text "marmot"
    :article "a"}

   {:text "tiger"
    :article "a"
    :sounds ["roars"]
    :adjectives ["roaring"]}

   {:text "hamster"
    :article "a"}

   {:text "gerbil"
    :article "a"}

   {:text "hedgehog"
    :article "a"}])

(def noises 
  [{:text "foghorn"
    :article "a"}

   {:text "laughter"
    :article "some"}

   {:text "laughing"
    :article "somebody"}

   {:text "chuckling"
    :article "someone"}

   {:text "cackling"
    :article "someone"}

   {:text "crying"
    :article "someone"}

   {:text "sobbing"
    :article "someone"}

   {:text "sneeze"
    :article "a"}

   {:text "wolves howling"}

   {:text "ice cream truck"
    :article "an"}

   {:text "door slam"
    :article "a"}

   {:text "sinister chuckle"
    :article "a"}])

(def disasters
  [{:text "fire"
    :article "a"}

   {:text "tornado"
    :article "a"}

   {:text "hurricane"
    :article "a"}

   {:text "flood"
    :article "a"}

   {:text "tsunami"
    :article "a"}

   {:text "landslide"
    :article "a"}

   {:text "avalanche"
    :article "an"}

   {:text "radioactive leak"
    :article "a"}

   {:text "lava flow"
    :article "a"}

   {:text "sandstorm"
    :article "a"}

   {:text "lightning strike"
    :article "a"}

   {:text "plague of locusts"
    :article "a"}

   {:text "snowstorm"
    :article "a"}

   {:text "duststorm"
    :article "a"}])

(def obstacles
  [{:text "a black comb on the ground"}
   {:text "a stack of dogs going all the way to the moon"}
   {:text "an obstinant balloon expert"}
   {:text "a pile of corroded Ewoks"}
   {:text "a horrible taste in your mouth"}
   {:text "a movie being shown in the wrong aspect ratio"}
   {:text "someone who has never listened to Neutral Milk Hotel"}
   {:text "the thing your aunt gave you which you don't know what it is"}
   {:text "an aquarium full of milk"}
   {:text "dubstep"}
   {:text "a 404 error"}
   {:text "Adam Sandler's career"}
   {:text "that awful man"}
   {:text "a dude who insists on putting his hand in his girlfriend's back pocket"}
   {:text "a maelstrom of hipster beards"}
   {:text "a wall of tepid soup"}
   {:text "a giant cat tongue"}
   {:text "George Lucas' neck"}
   {:text "Ruby On Rails"}
   {:text "someone who takes too many selfies"}
   {:text "a cat who has been pet against the grain"}
   {:text "substandard prequels"}
   {:text "the Scut Farkus Affair"}
   {:text "a lack of retweets"}
   {:text "a sweaty 486DX4 chip"}
   {:text "a convenient reclosing tab"}
   {:text "a lengthy German noun"}
   {:text "your own unwillingness to improve yourself"}
   {:text "{:class :person}'s sheer force of will"}
   {:text "{:class :person}'s birthday party"}
   {:text "a delicious Nutter Butter"}
   {:text "double-double Animal style"}
   {:text "someone who doesn’t know how to eat a goddamned Oreo properly"}])

(def games
  [{:text "Agricola"
    :type :tabletop}
   
   {:text "Advanced Squad Leader"
    :type :tabletop}

   {:text "Carcassonne"
    :type :tabletop}

   {:text "World in Flames"
    :type :tabletop}

   {:text "Monopoly"
    :type :tabletop}

   {:text "World of Warcraft"
    :type :video}

   {:text "Civilization V"
    :type :video}

   {:text "Grand Theft Auto V"
    :type :video}])

(def classes
  ["events"
   "location-events"
   "action-events"
   "secondary-events"
   "tertiary-events"
   "actor-actions"
   "locations"
   "dialogues"
   "intonations"
   "books"
   "directions"
   "persons"
   "actions"
   "adjectives"
   "adverbs"
   "scents"
   "diagnoses"
   "foods"
   "drinks"
   "signs"
   "obstacles"
   "garments"
   "items"
   "animals"
   "noises"
   "games"
   "thoughts"
   "disasters"])

(defn get-class
  [class]
  @(-> (str "xyzzwhy.data/" class) symbol resolve))
