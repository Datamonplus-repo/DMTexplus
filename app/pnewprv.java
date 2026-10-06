package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnewprv extends GXProcedure
{
   public pnewprv( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnewprv.class ), "" );
   }

   public pnewprv( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          String[] aP2 )
   {
      pnewprv.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 )
   {
      pnewprv.this.AV10EmprCod = aP0[0];
      this.aP0 = aP0;
      pnewprv.this.AV17PrvNum = aP1[0];
      this.aP1 = aP1;
      pnewprv.this.AV8EmprCod2 = aP2[0];
      this.aP2 = aP2;
      pnewprv.this.AV16PrvNum2 = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P027H2 */
      pr_default.execute(0, new Object[] {AV10EmprCod, Integer.valueOf(AV17PrvNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6572PrvContac = P027H2_A6572PrvContac[0] ;
         n6572PrvContac = P027H2_n6572PrvContac[0] ;
         A795PrvNum = P027H2_A795PrvNum[0] ;
         A396EmprCod = P027H2_A396EmprCod[0] ;
         A14417PrvNac = P027H2_A14417PrvNac[0] ;
         A14216PrvAct = P027H2_A14216PrvAct[0] ;
         A14030PrvClasID = P027H2_A14030PrvClasID[0] ;
         n14030PrvClasID = P027H2_n14030PrvClasID[0] ;
         A13585PrvTipo = P027H2_A13585PrvTipo[0] ;
         n13585PrvTipo = P027H2_n13585PrvTipo[0] ;
         A10477PrvDiaPgA = P027H2_A10477PrvDiaPgA[0] ;
         n10477PrvDiaPgA = P027H2_n10477PrvDiaPgA[0] ;
         A10122GpoEcoCod = P027H2_A10122GpoEcoCod[0] ;
         n10122GpoEcoCod = P027H2_n10122GpoEcoCod[0] ;
         A9728Cod_Clas = P027H2_A9728Cod_Clas[0] ;
         n9728Cod_Clas = P027H2_n9728Cod_Clas[0] ;
         A8160PrvDtoPP = P027H2_A8160PrvDtoPP[0] ;
         n8160PrvDtoPP = P027H2_n8160PrvDtoPP[0] ;
         A6571PrvDir2 = P027H2_A6571PrvDir2[0] ;
         n6571PrvDir2 = P027H2_n6571PrvDir2[0] ;
         A6570PrvNom2 = P027H2_A6570PrvNom2[0] ;
         n6570PrvNom2 = P027H2_n6570PrvNom2[0] ;
         A6077PrvMail = P027H2_A6077PrvMail[0] ;
         n6077PrvMail = P027H2_n6077PrvMail[0] ;
         A6076PrvFax = P027H2_A6076PrvFax[0] ;
         n6076PrvFax = P027H2_n6076PrvFax[0] ;
         A6075PrvCp2 = P027H2_A6075PrvCp2[0] ;
         n6075PrvCp2 = P027H2_n6075PrvCp2[0] ;
         A3314PrvCar = P027H2_A3314PrvCar[0] ;
         n3314PrvCar = P027H2_n3314PrvCar[0] ;
         A3143PrvDivCo = P027H2_A3143PrvDivCo[0] ;
         A3092PrvDivCod = P027H2_A3092PrvDivCod[0] ;
         n3092PrvDivCod = P027H2_n3092PrvDivCod[0] ;
         A783PrvCta = P027H2_A783PrvCta[0] ;
         n783PrvCta = P027H2_n783PrvCta[0] ;
         A792PrvMetTra = P027H2_A792PrvMetTra[0] ;
         n792PrvMetTra = P027H2_n792PrvMetTra[0] ;
         A798PrvPlaEnt = P027H2_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P027H2_n798PrvPlaEnt[0] ;
         A801PrvRep = P027H2_A801PrvRep[0] ;
         n801PrvRep = P027H2_n801PrvRep[0] ;
         A780PrvBan = P027H2_A780PrvBan[0] ;
         n780PrvBan = P027H2_n780PrvBan[0] ;
         A797PrvPer = P027H2_A797PrvPer[0] ;
         n797PrvPer = P027H2_n797PrvPer[0] ;
         A785PrvDiaPag = P027H2_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P027H2_n785PrvDiaPag[0] ;
         A805PrvVto = P027H2_A805PrvVto[0] ;
         n805PrvVto = P027H2_n805PrvVto[0] ;
         A497FpgCod = P027H2_A497FpgCod[0] ;
         n497FpgCod = P027H2_n497FpgCod[0] ;
         A802PrvTip = P027H2_A802PrvTip[0] ;
         n802PrvTip = P027H2_n802PrvTip[0] ;
         A804PrvTlx = P027H2_A804PrvTlx[0] ;
         n804PrvTlx = P027H2_n804PrvTlx[0] ;
         A800PrvPri = P027H2_A800PrvPri[0] ;
         n800PrvPri = P027H2_n800PrvPri[0] ;
         A803PrvTlf = P027H2_A803PrvTlf[0] ;
         n803PrvTlf = P027H2_n803PrvTlf[0] ;
         A793PrvNif = P027H2_A793PrvNif[0] ;
         n793PrvNif = P027H2_n793PrvNif[0] ;
         A799PrvPob = P027H2_A799PrvPob[0] ;
         n799PrvPob = P027H2_n799PrvPob[0] ;
         A782PrvCpo = P027H2_A782PrvCpo[0] ;
         n782PrvCpo = P027H2_n782PrvCpo[0] ;
         A786PrvDir = P027H2_A786PrvDir[0] ;
         n786PrvDir = P027H2_n786PrvDir[0] ;
         A794PrvNom = P027H2_A794PrvNom[0] ;
         n794PrvNom = P027H2_n794PrvNom[0] ;
         W396EmprCod = A396EmprCod ;
         W795PrvNum = A795PrvNum ;
         /*
            INSERT RECORD ON TABLE TXPPRVGEN

         */
         W396EmprCod = A396EmprCod ;
         W795PrvNum = A795PrvNum ;
         A396EmprCod = AV8EmprCod2 ;
         A795PrvNum = AV16PrvNum2 ;
         /* Using cursor P027H3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Boolean.valueOf(n794PrvNom), A794PrvNom, Boolean.valueOf(n786PrvDir), A786PrvDir, Boolean.valueOf(n782PrvCpo), A782PrvCpo, Boolean.valueOf(n799PrvPob), A799PrvPob, Boolean.valueOf(n793PrvNif), A793PrvNif, Boolean.valueOf(n803PrvTlf), A803PrvTlf, Boolean.valueOf(n800PrvPri), Byte.valueOf(A800PrvPri), Boolean.valueOf(n804PrvTlx), A804PrvTlx, Boolean.valueOf(n802PrvTip), A802PrvTip, Boolean.valueOf(n497FpgCod), A497FpgCod, Boolean.valueOf(n805PrvVto), Byte.valueOf(A805PrvVto), Boolean.valueOf(n785PrvDiaPag), Integer.valueOf(A785PrvDiaPag), Boolean.valueOf(n797PrvPer), Integer.valueOf(A797PrvPer), Boolean.valueOf(n780PrvBan), Integer.valueOf(A780PrvBan), Boolean.valueOf(n801PrvRep), A801PrvRep, Boolean.valueOf(n798PrvPlaEnt), Short.valueOf(A798PrvPlaEnt), Boolean.valueOf(n792PrvMetTra), A792PrvMetTra, Boolean.valueOf(n783PrvCta), A783PrvCta, Boolean.valueOf(n3092PrvDivCod), A3092PrvDivCod, Byte.valueOf(A3143PrvDivCo), Boolean.valueOf(n3314PrvCar), A3314PrvCar, Boolean.valueOf(n6075PrvCp2), A6075PrvCp2, Boolean.valueOf(n6076PrvFax), A6076PrvFax, Boolean.valueOf(n6077PrvMail), A6077PrvMail, Boolean.valueOf(n6570PrvNom2), A6570PrvNom2, Boolean.valueOf(n6571PrvDir2), A6571PrvDir2, Boolean.valueOf(n6572PrvContac), A6572PrvContac, Boolean.valueOf(n8160PrvDtoPP), A8160PrvDtoPP, Boolean.valueOf(n9728Cod_Clas), Short.valueOf(A9728Cod_Clas), Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod), Boolean.valueOf(n10477PrvDiaPgA), A10477PrvDiaPgA, Boolean.valueOf(n13585PrvTipo), A13585PrvTipo, Boolean.valueOf(n14030PrvClasID), Short.valueOf(A14030PrvClasID), A14216PrvAct, A14417PrvNac});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRVGEN");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A795PrvNum = W795PrvNum ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A795PrvNum = W795PrvNum ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnewprv.this.AV10EmprCod;
      this.aP1[0] = pnewprv.this.AV17PrvNum;
      this.aP2[0] = pnewprv.this.AV8EmprCod2;
      this.aP3[0] = pnewprv.this.AV16PrvNum2;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnewprv");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P027H2_A6572PrvContac = new String[] {""} ;
      P027H2_n6572PrvContac = new boolean[] {false} ;
      P027H2_A795PrvNum = new int[1] ;
      P027H2_A396EmprCod = new String[] {""} ;
      P027H2_A14417PrvNac = new String[] {""} ;
      P027H2_A14216PrvAct = new String[] {""} ;
      P027H2_A14030PrvClasID = new short[1] ;
      P027H2_n14030PrvClasID = new boolean[] {false} ;
      P027H2_A13585PrvTipo = new String[] {""} ;
      P027H2_n13585PrvTipo = new boolean[] {false} ;
      P027H2_A10477PrvDiaPgA = new String[] {""} ;
      P027H2_n10477PrvDiaPgA = new boolean[] {false} ;
      P027H2_A10122GpoEcoCod = new int[1] ;
      P027H2_n10122GpoEcoCod = new boolean[] {false} ;
      P027H2_A9728Cod_Clas = new short[1] ;
      P027H2_n9728Cod_Clas = new boolean[] {false} ;
      P027H2_A8160PrvDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P027H2_n8160PrvDtoPP = new boolean[] {false} ;
      P027H2_A6571PrvDir2 = new String[] {""} ;
      P027H2_n6571PrvDir2 = new boolean[] {false} ;
      P027H2_A6570PrvNom2 = new String[] {""} ;
      P027H2_n6570PrvNom2 = new boolean[] {false} ;
      P027H2_A6077PrvMail = new String[] {""} ;
      P027H2_n6077PrvMail = new boolean[] {false} ;
      P027H2_A6076PrvFax = new String[] {""} ;
      P027H2_n6076PrvFax = new boolean[] {false} ;
      P027H2_A6075PrvCp2 = new String[] {""} ;
      P027H2_n6075PrvCp2 = new boolean[] {false} ;
      P027H2_A3314PrvCar = new String[] {""} ;
      P027H2_n3314PrvCar = new boolean[] {false} ;
      P027H2_A3143PrvDivCo = new byte[1] ;
      P027H2_A3092PrvDivCod = new String[] {""} ;
      P027H2_n3092PrvDivCod = new boolean[] {false} ;
      P027H2_A783PrvCta = new String[] {""} ;
      P027H2_n783PrvCta = new boolean[] {false} ;
      P027H2_A792PrvMetTra = new String[] {""} ;
      P027H2_n792PrvMetTra = new boolean[] {false} ;
      P027H2_A798PrvPlaEnt = new short[1] ;
      P027H2_n798PrvPlaEnt = new boolean[] {false} ;
      P027H2_A801PrvRep = new String[] {""} ;
      P027H2_n801PrvRep = new boolean[] {false} ;
      P027H2_A780PrvBan = new int[1] ;
      P027H2_n780PrvBan = new boolean[] {false} ;
      P027H2_A797PrvPer = new int[1] ;
      P027H2_n797PrvPer = new boolean[] {false} ;
      P027H2_A785PrvDiaPag = new int[1] ;
      P027H2_n785PrvDiaPag = new boolean[] {false} ;
      P027H2_A805PrvVto = new byte[1] ;
      P027H2_n805PrvVto = new boolean[] {false} ;
      P027H2_A497FpgCod = new String[] {""} ;
      P027H2_n497FpgCod = new boolean[] {false} ;
      P027H2_A802PrvTip = new String[] {""} ;
      P027H2_n802PrvTip = new boolean[] {false} ;
      P027H2_A804PrvTlx = new String[] {""} ;
      P027H2_n804PrvTlx = new boolean[] {false} ;
      P027H2_A800PrvPri = new byte[1] ;
      P027H2_n800PrvPri = new boolean[] {false} ;
      P027H2_A803PrvTlf = new String[] {""} ;
      P027H2_n803PrvTlf = new boolean[] {false} ;
      P027H2_A793PrvNif = new String[] {""} ;
      P027H2_n793PrvNif = new boolean[] {false} ;
      P027H2_A799PrvPob = new String[] {""} ;
      P027H2_n799PrvPob = new boolean[] {false} ;
      P027H2_A782PrvCpo = new String[] {""} ;
      P027H2_n782PrvCpo = new boolean[] {false} ;
      P027H2_A786PrvDir = new String[] {""} ;
      P027H2_n786PrvDir = new boolean[] {false} ;
      P027H2_A794PrvNom = new String[] {""} ;
      P027H2_n794PrvNom = new boolean[] {false} ;
      A6572PrvContac = "" ;
      A396EmprCod = "" ;
      A14417PrvNac = "" ;
      A14216PrvAct = "" ;
      A13585PrvTipo = "" ;
      A10477PrvDiaPgA = "" ;
      A8160PrvDtoPP = DecimalUtil.ZERO ;
      A6571PrvDir2 = "" ;
      A6570PrvNom2 = "" ;
      A6077PrvMail = "" ;
      A6076PrvFax = "" ;
      A6075PrvCp2 = "" ;
      A3314PrvCar = "" ;
      A3092PrvDivCod = "" ;
      A783PrvCta = "" ;
      A792PrvMetTra = "" ;
      A801PrvRep = "" ;
      A497FpgCod = "" ;
      A802PrvTip = "" ;
      A804PrvTlx = "" ;
      A803PrvTlf = "" ;
      A793PrvNif = "" ;
      A799PrvPob = "" ;
      A782PrvCpo = "" ;
      A786PrvDir = "" ;
      A794PrvNom = "" ;
      W396EmprCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnewprv__default(),
         new Object[] {
             new Object[] {
            P027H2_A6572PrvContac, P027H2_n6572PrvContac, P027H2_A795PrvNum, P027H2_A396EmprCod, P027H2_A14417PrvNac, P027H2_A14216PrvAct, P027H2_A14030PrvClasID, P027H2_n14030PrvClasID, P027H2_A13585PrvTipo, P027H2_n13585PrvTipo,
            P027H2_A10477PrvDiaPgA, P027H2_n10477PrvDiaPgA, P027H2_A10122GpoEcoCod, P027H2_n10122GpoEcoCod, P027H2_A9728Cod_Clas, P027H2_n9728Cod_Clas, P027H2_A8160PrvDtoPP, P027H2_n8160PrvDtoPP, P027H2_A6571PrvDir2, P027H2_n6571PrvDir2,
            P027H2_A6570PrvNom2, P027H2_n6570PrvNom2, P027H2_A6077PrvMail, P027H2_n6077PrvMail, P027H2_A6076PrvFax, P027H2_n6076PrvFax, P027H2_A6075PrvCp2, P027H2_n6075PrvCp2, P027H2_A3314PrvCar, P027H2_n3314PrvCar,
            P027H2_A3143PrvDivCo, P027H2_A3092PrvDivCod, P027H2_n3092PrvDivCod, P027H2_A783PrvCta, P027H2_n783PrvCta, P027H2_A792PrvMetTra, P027H2_n792PrvMetTra, P027H2_A798PrvPlaEnt, P027H2_n798PrvPlaEnt, P027H2_A801PrvRep,
            P027H2_n801PrvRep, P027H2_A780PrvBan, P027H2_n780PrvBan, P027H2_A797PrvPer, P027H2_n797PrvPer, P027H2_A785PrvDiaPag, P027H2_n785PrvDiaPag, P027H2_A805PrvVto, P027H2_n805PrvVto, P027H2_A497FpgCod,
            P027H2_n497FpgCod, P027H2_A802PrvTip, P027H2_n802PrvTip, P027H2_A804PrvTlx, P027H2_n804PrvTlx, P027H2_A800PrvPri, P027H2_n800PrvPri, P027H2_A803PrvTlf, P027H2_n803PrvTlf, P027H2_A793PrvNif,
            P027H2_n793PrvNif, P027H2_A799PrvPob, P027H2_n799PrvPob, P027H2_A782PrvCpo, P027H2_n782PrvCpo, P027H2_A786PrvDir, P027H2_n786PrvDir, P027H2_A794PrvNom, P027H2_n794PrvNom
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A3143PrvDivCo ;
   private byte A805PrvVto ;
   private byte A800PrvPri ;
   private short A14030PrvClasID ;
   private short A9728Cod_Clas ;
   private short A798PrvPlaEnt ;
   private short Gx_err ;
   private int AV17PrvNum ;
   private int AV16PrvNum2 ;
   private int A795PrvNum ;
   private int A10122GpoEcoCod ;
   private int A780PrvBan ;
   private int A797PrvPer ;
   private int A785PrvDiaPag ;
   private int W795PrvNum ;
   private int GX_INS94 ;
   private java.math.BigDecimal A8160PrvDtoPP ;
   private String AV10EmprCod ;
   private String AV8EmprCod2 ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A14417PrvNac ;
   private String A14216PrvAct ;
   private String A13585PrvTipo ;
   private String A10477PrvDiaPgA ;
   private String A6571PrvDir2 ;
   private String A6570PrvNom2 ;
   private String A6077PrvMail ;
   private String A6076PrvFax ;
   private String A6075PrvCp2 ;
   private String A3314PrvCar ;
   private String A3092PrvDivCod ;
   private String A783PrvCta ;
   private String A792PrvMetTra ;
   private String A801PrvRep ;
   private String A497FpgCod ;
   private String A802PrvTip ;
   private String A804PrvTlx ;
   private String A803PrvTlf ;
   private String A793PrvNif ;
   private String A799PrvPob ;
   private String A782PrvCpo ;
   private String A786PrvDir ;
   private String A794PrvNom ;
   private String W396EmprCod ;
   private String Gx_emsg ;
   private boolean n6572PrvContac ;
   private boolean n14030PrvClasID ;
   private boolean n13585PrvTipo ;
   private boolean n10477PrvDiaPgA ;
   private boolean n10122GpoEcoCod ;
   private boolean n9728Cod_Clas ;
   private boolean n8160PrvDtoPP ;
   private boolean n6571PrvDir2 ;
   private boolean n6570PrvNom2 ;
   private boolean n6077PrvMail ;
   private boolean n6076PrvFax ;
   private boolean n6075PrvCp2 ;
   private boolean n3314PrvCar ;
   private boolean n3092PrvDivCod ;
   private boolean n783PrvCta ;
   private boolean n792PrvMetTra ;
   private boolean n798PrvPlaEnt ;
   private boolean n801PrvRep ;
   private boolean n780PrvBan ;
   private boolean n797PrvPer ;
   private boolean n785PrvDiaPag ;
   private boolean n805PrvVto ;
   private boolean n497FpgCod ;
   private boolean n802PrvTip ;
   private boolean n804PrvTlx ;
   private boolean n800PrvPri ;
   private boolean n803PrvTlf ;
   private boolean n793PrvNif ;
   private boolean n799PrvPob ;
   private boolean n782PrvCpo ;
   private boolean n786PrvDir ;
   private boolean n794PrvNom ;
   private String A6572PrvContac ;
   private int[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P027H2_A6572PrvContac ;
   private boolean[] P027H2_n6572PrvContac ;
   private int[] P027H2_A795PrvNum ;
   private String[] P027H2_A396EmprCod ;
   private String[] P027H2_A14417PrvNac ;
   private String[] P027H2_A14216PrvAct ;
   private short[] P027H2_A14030PrvClasID ;
   private boolean[] P027H2_n14030PrvClasID ;
   private String[] P027H2_A13585PrvTipo ;
   private boolean[] P027H2_n13585PrvTipo ;
   private String[] P027H2_A10477PrvDiaPgA ;
   private boolean[] P027H2_n10477PrvDiaPgA ;
   private int[] P027H2_A10122GpoEcoCod ;
   private boolean[] P027H2_n10122GpoEcoCod ;
   private short[] P027H2_A9728Cod_Clas ;
   private boolean[] P027H2_n9728Cod_Clas ;
   private java.math.BigDecimal[] P027H2_A8160PrvDtoPP ;
   private boolean[] P027H2_n8160PrvDtoPP ;
   private String[] P027H2_A6571PrvDir2 ;
   private boolean[] P027H2_n6571PrvDir2 ;
   private String[] P027H2_A6570PrvNom2 ;
   private boolean[] P027H2_n6570PrvNom2 ;
   private String[] P027H2_A6077PrvMail ;
   private boolean[] P027H2_n6077PrvMail ;
   private String[] P027H2_A6076PrvFax ;
   private boolean[] P027H2_n6076PrvFax ;
   private String[] P027H2_A6075PrvCp2 ;
   private boolean[] P027H2_n6075PrvCp2 ;
   private String[] P027H2_A3314PrvCar ;
   private boolean[] P027H2_n3314PrvCar ;
   private byte[] P027H2_A3143PrvDivCo ;
   private String[] P027H2_A3092PrvDivCod ;
   private boolean[] P027H2_n3092PrvDivCod ;
   private String[] P027H2_A783PrvCta ;
   private boolean[] P027H2_n783PrvCta ;
   private String[] P027H2_A792PrvMetTra ;
   private boolean[] P027H2_n792PrvMetTra ;
   private short[] P027H2_A798PrvPlaEnt ;
   private boolean[] P027H2_n798PrvPlaEnt ;
   private String[] P027H2_A801PrvRep ;
   private boolean[] P027H2_n801PrvRep ;
   private int[] P027H2_A780PrvBan ;
   private boolean[] P027H2_n780PrvBan ;
   private int[] P027H2_A797PrvPer ;
   private boolean[] P027H2_n797PrvPer ;
   private int[] P027H2_A785PrvDiaPag ;
   private boolean[] P027H2_n785PrvDiaPag ;
   private byte[] P027H2_A805PrvVto ;
   private boolean[] P027H2_n805PrvVto ;
   private String[] P027H2_A497FpgCod ;
   private boolean[] P027H2_n497FpgCod ;
   private String[] P027H2_A802PrvTip ;
   private boolean[] P027H2_n802PrvTip ;
   private String[] P027H2_A804PrvTlx ;
   private boolean[] P027H2_n804PrvTlx ;
   private byte[] P027H2_A800PrvPri ;
   private boolean[] P027H2_n800PrvPri ;
   private String[] P027H2_A803PrvTlf ;
   private boolean[] P027H2_n803PrvTlf ;
   private String[] P027H2_A793PrvNif ;
   private boolean[] P027H2_n793PrvNif ;
   private String[] P027H2_A799PrvPob ;
   private boolean[] P027H2_n799PrvPob ;
   private String[] P027H2_A782PrvCpo ;
   private boolean[] P027H2_n782PrvCpo ;
   private String[] P027H2_A786PrvDir ;
   private boolean[] P027H2_n786PrvDir ;
   private String[] P027H2_A794PrvNom ;
   private boolean[] P027H2_n794PrvNom ;
}

final  class pnewprv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P027H2", "SELECT PrvContac, PrvNum, EmprCod, PrvNac, PrvAct, PrvClasID, PrvTipo, PrvDiaPgA, GpoEcoCod, Cod_Clas, PrvDtoPP, PrvDir2, PrvNom2, PrvMail, PrvFax, PrvCp2, PrvCar, PrvDivCo, PrvDivCod, PrvCta, PrvMetTra, PrvPlaEnt, PrvRep, PrvBan, PrvPer, PrvDiaPag, PrvVto, FpgCod, PrvTip, PrvTlx, PrvPri, PrvTlf, PrvNif, PrvPob, PrvCpo, PrvDir, PrvNom FROM TXPPRVGEN WHERE EmprCod = ? and PrvNum = ? ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P027H3", "INSERT INTO TXPPRVGEN(EmprCod, PrvNum, PrvNom, PrvDir, PrvCpo, PrvPob, PrvNif, PrvTlf, PrvPri, PrvTlx, PrvTip, FpgCod, PrvVto, PrvDiaPag, PrvPer, PrvBan, PrvRep, PrvPlaEnt, PrvMetTra, PrvCta, PrvDivCod, PrvDivCo, PrvCar, PrvCp2, PrvFax, PrvMail, PrvNom2, PrvDir2, PrvContac, PrvDtoPP, Cod_Clas, GpoEcoCod, PrvDiaPgA, PrvTipo, PrvClasID, PrvAct, PrvNac) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRVGEN")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 40);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 40);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 40);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 15);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((byte[]) buf[30])[0] = rslt.getByte(18);
               ((String[]) buf[31])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(20, 12);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(22);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(23, 20);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(24);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((int[]) buf[43])[0] = rslt.getInt(25);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((int[]) buf[45])[0] = rslt.getInt(26);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((byte[]) buf[47])[0] = rslt.getByte(27);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(28, 2);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(30, 14);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((byte[]) buf[55])[0] = rslt.getByte(31);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(32, 18);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(33, 20);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(34, 30);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(35, 6);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(36, 30);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(37, 30);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 30);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 6);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 30);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 20);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[13], 18);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[17], 14);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[23]).byteValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[25]).intValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[27]).intValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[29]).intValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[31], 20);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[33]).shortValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[35], 1);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[37], 12);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[39], 1);
               }
               stmt.setByte(22, ((Number) parms[40]).byteValue());
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[42], 1);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[44], 6);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[46], 15);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[48], 40);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[50], 40);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[52], 40);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(29, (String)parms[54]);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(30, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[58]).shortValue());
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(32, ((Number) parms[60]).intValue());
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[62], 6);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[64], 1);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(35, ((Number) parms[66]).shortValue());
               }
               stmt.setString(36, (String)parms[67], 1);
               stmt.setString(37, (String)parms[68], 1);
               return;
      }
   }

}

