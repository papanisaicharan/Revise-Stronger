### **1. What is blockchain?**
#### **Decentralized Ledgers**

To understand Blockchain, we need to go back in time. In 1000 BC, There exist a small island in south pacific called Yap island. The Yapese people had a very unique form of currency. They used Rai stones (Rai stones - 12 tall, 8,000lbs!!). One may get rai stones if he sells his land. Here the money(Rai stones) is not movable or physically traded. So here comes the question:

**What happens when money can't be physically traded?**

To solve the above problem, they used to keep a ledger. So now what is a ledger?
- A ledger is a recording of all transactions
- The leadger records: What are exchanged? and who exchanged it?

Stones or coins do not have to be physically traded and their ownership can be tracked on a ledger

##### **What is Blockchain?**
How does Yapese manage the ledger?
Solution: Decentralized ledger
- All the tribe members keep a copy of ledger in their head. Everyone knew who owned which Rai stone at any time
- When two parties wished to transact, they would announce their transaction to the tribe
- When a transaction was announced, all tribe members updated their mental ledger.

Example: 
- Alice agrees to trade Bob her stone by the pond in exchangefor all of his cattle.
- Alice and bob announce their transaction to the tribe.
- Everyone updates their mental ledger. From this point on, they agree that the coin by the pond is owned by Bob untile he trades it.

**A brief history of Accounting.**
- Ledgers appear around 5000 BC 
	- single entry only
- 300 BC - Chanakya
	- First documented accounting standards
- Double-entry ledger appears in 1340 AD
	- Track debits and credits
	- Tell the story of a transaction from both/ all sides
- Triple-entry ledger appears in 2009
	- aka Blockchain
	- Debits, credits and an immutable link to all past debits and credits

Yapes could have followed the below procedure.

- Yapese could have kept a single ledger(a bank)
- One tribe member would keep account of all transactions
- That person would have to be very trustworthy
- The entire tribe would have to trust the record keeper
- Have to be flexible due to sickness, vacations

But the Yapese didn't followed the above procedure due to lack trustworthiness.

For example:
- Alice tries to corrupt Carol so that Carol's ledger shows that Alice never gave up ownership of the coin. and one person losses his property.

- Centralized ledger: only one place to go to cheat.

- decentralized ledger: Carol will be outvoted by the rest of the tribe and her version of the ledger will not be accepted.

- If Alice wants to cheat, she will need to convince 51% or more of the tribe to accept an alternative ledger.

**Centralized ledger vs Decentralized Ledger**
- if single copy fo ledger were changed by any means, wealth would be lost unfairly.
- With a decentralized leadger, nobody has to trust anyone else
	- Trustless environment is assumed from the beginning
	- Some members may have corrupt or incomplete data, this is okay as the majority will not accept it.
	- Some members may not be present, that's okay. They can get caught up when they come back online.
	- The Whole tribe must reach consensus on the truth
		- This is called "Group Consensues"
		- The truth is assumed to be the version of the ledger that 51% or more of the tribe members present agree on
	- Separation of possession and ownership
		- One day a ship carrying a new coin back to the island sank in the harbor
		- The tribe decide to add it to the ledger and trade it just like any other coin
		- Possession does not equal ownership

**Decentralized ledger == Bank**
- Take deposits, issue credits.
- Decouples possession and ownership
- Provides a trust-able ledger to all parties
- Acts a trust broker when two parties who don't trust each other want to trade

**Analogy:**

Internet[Email -> Streaming Media -> Social Media]

Blockchain[Bitcoin -> Identity Management -> ??? ]

**Why not use the Yapese system today?**
- Scalability
	- 	Humans can only remember a small number of transactions mentally
	- 	even with pencil and paper, limited in how far could we scale up system.
- Privacy
	- 	On yap island everybody knew the personal net worth of everyone else
	- 	this is not possible for the modern society

**What is Block?**
- Let's say all transactions are recorded on paper
- Each sheet of paper has 25 lines
- when a sheet is filled, the tribe will validate the transaction on the current page
	- 	Do we all agre with the data on the page?

**How are Blocks "chained" together?**
- Use of computer & cryptography
- All data in a block is run through a cryptographic hash(We will dive into this later)
- Hashes creates a unique output for a specific input.
	- 	Can always recreate if use same inputs
	- 	Think Black box
- Chain as established by embedding the last block's data into the header of current block.
	- Changing the data on any block will result in a different hash
- The new hash will not match the hash in the next block header
	- If you try to change the next block header, it will change the hash of that block.

**What is blockchain?**
A record keeping system-
- To record the transfer of "tokens" or "coins" representing wealth (Monetary/currency)
	- Bitcoin and other cryptocurriencies such as Ether, Litecoin, Monero etc

Three types of "transactions"
- Two or more parties, exhange of monetary value
	- cryptocurrency
	- Most familiar
- Peel back the idea of monetary exchange
	- Two or more parties, but no exhange of monetary value
	- update to medical records, notary services
- Peel back the idea of two or more parties 
	- One party "announcing" an important event
	- Supply chain management, Business process automation

Blockchain is..
- Event tracking system - announcements mark events
- Events can be actionable (smart contracts)
- Smart contracts make a workflow platform
	- write rules around events

**History of Blockchain**
- The Byxantine General problem (1982)
	- A number of generals (from the same Army) have surrounded a walled city on all sides. The balance of power is such that if all generals attack at the same time, they will take the city. However, if the generals are not coordinated in their attack, they will lose the city and their campaign.
- What cna the general do to ensure they can trust the content of their messages?
	- The Byzantine generals problem(!982)
		- This was an unsolved problem until 2008
	- Solution
		- use cryptography to encrypt messages
		- Ensure more mathematical computation power exists outside the city than inside it
		- This ensure most messages can not be decrypted, changed, and re-encrypted in the time takes the generals to decrypt the messages.

Blockchain is the digitalized solution for this problem
- Mathematicians are financially rewarded for helping the generals
- We refer to this process as "mining", "validating" or reaching "group consensus"

**History of blockchain platforms**
- In 2008, a whitepaper is published by "Satoshi Nakamoto" which outlined asolution to the Byzantine generals problem.
	- Byxantine fault tolerance
- Solution is presented as a tokenized currency, bitcoin is born, starts in 2009. Satoshi is anonymous

- 2015
- **July 30 - Ethereum goes live**
	- public Blockchain (primarily)
	- Open source
	- Built-in currency - Ether
	- EVM = Ethereum Virtual Machine
	- "global computer" where contracts are executed. Nodes and peer to peer architecture is largely abstracted away from developers
	- Turing complete smart contract programming language
		- Turing complete - A language which lets developers solve any class of problem in existence given infinite time and resources
		-Turing Incomplete - can not solve all types of problems such as problems with loops and iterations (Bitcoin)
	- Smart contracts
		- 	if you are a developer, smart contact == class
		- 	For everyone else.... workflow with money
		- 	A smart contract is a set of rules:
		- 	These rules will be called when a certain type of financial transaction is made
		- 	These rules will be called when a certain type of non-financial transaction is made
		- 	These rules will be called when a certain type of non-financial announcement is made
	- Much more mature ecosystem
	- Large and very active community
	- Transaction cost "gas"
	- "Gas" is paid for with Ether
		- Gas and Ehter are decoupled for price stability
	- Permission-less architecture
		- 100% transparent data, Smart contract bytecode (source code)
		- Slower than Hyperledger (Transaction speed), does not scale as easily
		- Currently used for individual, non-corporate use. decentralized public applications

**December 2015 - Hyperledger gone live**
- IBM and the linux foundation
- Open source
- Private Blockchain (primarily)
- "Hyperledger" refers to a suite consisting of multiple technologies
	- 	Hyperledger Fabric (IBM)
	- 	Sawtooth (Intel)
	- 	R3 (Corda)
	- 	Composer
		- 	Toolset and framework for easily developing business networks
- Modular architecture
- Chaincode (a.ak.a smart contracts)
- Configurable group consensus and security/membership mechanisms
- Designed for use in corporate scenarios, finer grained control over system behaviours
- Two types of transactions
	- "Deploy" and Intake"
- Client apps communicate with chaincode (smart contracts) via an SDK

**Yearly look**

- 1982
	- Byzantize general problem
- 2008 
	- Satoshi whitepaper
- 2009
	- Bitcoin - cryptocurrency released
- 2015 July
	- Etherum gone live
- 2015 Dec
	- Hyperledger gone live
