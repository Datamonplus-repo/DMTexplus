package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apbuspro2 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apbuspro2 pgm = new apbuspro2 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      int[] aP1 = new int[] {0};
      int[] aP2 = new int[] {0};
      String[] aP3 = new String[] {""};
      String[] aP4 = new String[] {""};
      int[] aP5 = new int[] {0};
      byte[] aP6 = new byte[] {0};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (int) GXutil.lval( args[1]);
         aP2[0] = (int) GXutil.lval( args[2]);
         aP3[0] = (String) args[3];
         aP4[0] = (String) args[4];
         aP5[0] = (int) GXutil.lval( args[5]);
         aP6[0] = (byte) GXutil.lval( args[6]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   public apbuspro2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apbuspro2.class ), "" );
   }

   public apbuspro2( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           int[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           int[] aP5 )
   {
      apbuspro2.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             byte[] aP6 )
   {
      apbuspro2.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      apbuspro2.this.AV16DisCod = aP1[0];
      this.aP1 = aP1;
      apbuspro2.this.AV18CliCod = aP2[0];
      this.aP2 = aP2;
      apbuspro2.this.AV33ForSer = aP3[0];
      this.aP3 = aP3;
      apbuspro2.this.AV34ForColNom = aP4[0];
      this.aP4 = aP4;
      apbuspro2.this.AV35ForColNum = aP5[0];
      this.aP5 = aP5;
      apbuspro2.this.AV36TipColCod = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03XP2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV18CliCod), AV33ForSer, AV34ForColNom, Integer.valueOf(AV35ForColNum), Byte.valueOf(AV36TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P03XP2_A831TipColCod[0] ;
         A483ForColNum = P03XP2_A483ForColNum[0] ;
         A482ForColNom = P03XP2_A482ForColNom[0] ;
         A494ForSer = P03XP2_A494ForSer[0] ;
         A252CliCod = P03XP2_A252CliCod[0] ;
         A853For_ProC = P03XP2_A853For_ProC[0] ;
         A396EmprCod = P03XP2_A396EmprCod[0] ;
         GXt_char1 = A2318For_ProD ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A853For_ProC ;
         GXv_char4[0] = GXt_char1 ;
         new app.pprodsc(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
         apbuspro2.this.A396EmprCod = GXv_char2[0] ;
         apbuspro2.this.A853For_ProC = GXv_char3[0] ;
         apbuspro2.this.GXt_char1 = GXv_char4[0] ;
         A2318For_ProD = GXt_char1 ;
         W396EmprCod = A396EmprCod ;
         AV19ProCod = A853For_ProC ;
         /*
            INSERT RECORD ON TABLE TXPDISLIN

         */
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         A396EmprCod = AV15EmprCod ;
         A361DisCod = AV16DisCod ;
         A758ProCod = AV19ProCod ;
         A846UltFasLin = (short)(0) ;
         /* Using cursor P03XP3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A846UltFasLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
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
         A361DisCod = W361DisCod ;
         /* End Insert */
         AV37NumFase = 0 ;
         /* Using cursor P03XP4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A853For_ProC});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A1028For_Ord = P03XP4_A1028For_Ord[0] ;
            A456FasActTin = P03XP4_A456FasActTin[0] ;
            n456FasActTin = P03XP4_n456FasActTin[0] ;
            A4286FasForMul = P03XP4_A4286FasForMul[0] ;
            n4286FasForMul = P03XP4_n4286FasForMul[0] ;
            A2319For_UltL = P03XP4_A2319For_UltL[0] ;
            n2319For_UltL = P03XP4_n2319For_UltL[0] ;
            A7744FasPreObl = P03XP4_A7744FasPreObl[0] ;
            n7744FasPreObl = P03XP4_n7744FasPreObl[0] ;
            A457FasCod = P03XP4_A457FasCod[0] ;
            n457FasCod = P03XP4_n457FasCod[0] ;
            A456FasActTin = P03XP4_A456FasActTin[0] ;
            n456FasActTin = P03XP4_n456FasActTin[0] ;
            A4286FasForMul = P03XP4_A4286FasForMul[0] ;
            n4286FasForMul = P03XP4_n4286FasForMul[0] ;
            A7744FasPreObl = P03XP4_A7744FasPreObl[0] ;
            n7744FasPreObl = P03XP4_n7744FasPreObl[0] ;
            W396EmprCod = A396EmprCod ;
            AV22FasCod = A457FasCod ;
            AV37NumFase = A1028For_Ord ;
            /*
               INSERT RECORD ON TABLE TXPDISFAS

            */
            W396EmprCod = A396EmprCod ;
            W361DisCod = A361DisCod ;
            W457FasCod = A457FasCod ;
            n457FasCod = false ;
            A396EmprCod = AV15EmprCod ;
            A361DisCod = AV16DisCod ;
            A758ProCod = AV19ProCod ;
            A368DisFasLin = (short)(AV37NumFase) ;
            A457FasCod = AV22FasCod ;
            n457FasCod = false ;
            A5376DisQuiUl = A2319For_UltL ;
            /* Using cursor P03XP5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Boolean.valueOf(n457FasCod), A457FasCod, Short.valueOf(A5376DisQuiUl), Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
            if ( (pr_default.getStatus(3) == 1) )
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
            A361DisCod = W361DisCod ;
            A457FasCod = W457FasCod ;
            n457FasCod = false ;
            /* End Insert */
            /* Using cursor P03XP6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A853For_ProC, Integer.valueOf(A1028For_Ord)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A2320For_Lin = P03XP6_A2320For_Lin[0] ;
               A2321For_PqC = P03XP6_A2321For_PqC[0] ;
               n2321For_PqC = P03XP6_n2321For_PqC[0] ;
               GXt_char1 = A2322For_PqD ;
               GXv_char4[0] = GXt_char1 ;
               new app.pprofordsc(remoteHandle, context).execute( A396EmprCod, A2321For_PqC, GXv_char4) ;
               apbuspro2.this.GXt_char1 = GXv_char4[0] ;
               A2322For_PqD = GXt_char1 ;
               W396EmprCod = A396EmprCod ;
               if ( ( GXutil.strcmp(A4286FasForMul, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A456FasActTin, httpContext.getMessage( "S", "")) != 0 ) )
               {
                  /*
                     INSERT RECORD ON TABLE TXPDISQUI

                  */
                  W396EmprCod = A396EmprCod ;
                  W361DisCod = A361DisCod ;
                  A396EmprCod = AV15EmprCod ;
                  A361DisCod = AV16DisCod ;
                  A758ProCod = AV19ProCod ;
                  A368DisFasLin = (short)(AV37NumFase) ;
                  A5377DisQuiLin = A2320For_Lin ;
                  A764ProForCod = A2321For_PqC ;
                  A5378DisQuiNp = (short)(0) ;
                  A5379DisQuiTp = (short)(0) ;
                  A5380DisQuiRb = (short)(0) ;
                  A5489DisQuiDsc = " " ;
                  /* Using cursor P03XP7 */
                  pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A5377DisQuiLin), A764ProForCod, Short.valueOf(A5378DisQuiNp), Short.valueOf(A5379DisQuiTp), Short.valueOf(A5380DisQuiRb), A5489DisQuiDsc});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISQUI");
                  if ( (pr_default.getStatus(5) == 1) )
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
                  A361DisCod = W361DisCod ;
                  /* End Insert */
               }
               A396EmprCod = W396EmprCod ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            A396EmprCod = W396EmprCod ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Optimized UPDATE. */
         /* Using cursor P03XP8 */
         short AV37NumFase846Aux;
         AV37NumFase846Aux = (short)(AV37NumFase) ;
         pr_default.execute(6, new Object[] {Short.valueOf(AV37NumFase846Aux), AV15EmprCod, Integer.valueOf(AV16DisCod), AV19ProCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
         /* End optimized UPDATE. */
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pbuspro2.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = apbuspro2.this.AV15EmprCod;
      this.aP1[0] = apbuspro2.this.AV16DisCod;
      this.aP2[0] = apbuspro2.this.AV18CliCod;
      this.aP3[0] = apbuspro2.this.AV33ForSer;
      this.aP4[0] = apbuspro2.this.AV34ForColNom;
      this.aP5[0] = apbuspro2.this.AV35ForColNum;
      this.aP6[0] = apbuspro2.this.AV36TipColCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "apbuspro2");
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
      P03XP2_A831TipColCod = new byte[1] ;
      P03XP2_A483ForColNum = new int[1] ;
      P03XP2_A482ForColNom = new String[] {""} ;
      P03XP2_A494ForSer = new String[] {""} ;
      P03XP2_A252CliCod = new int[1] ;
      P03XP2_A853For_ProC = new String[] {""} ;
      P03XP2_A396EmprCod = new String[] {""} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A853For_ProC = "" ;
      A396EmprCod = "" ;
      A2318For_ProD = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      W396EmprCod = "" ;
      AV19ProCod = "" ;
      A758ProCod = "" ;
      Gx_emsg = "" ;
      P03XP4_A396EmprCod = new String[] {""} ;
      P03XP4_A252CliCod = new int[1] ;
      P03XP4_A494ForSer = new String[] {""} ;
      P03XP4_A482ForColNom = new String[] {""} ;
      P03XP4_A483ForColNum = new int[1] ;
      P03XP4_A831TipColCod = new byte[1] ;
      P03XP4_A853For_ProC = new String[] {""} ;
      P03XP4_A1028For_Ord = new int[1] ;
      P03XP4_A456FasActTin = new String[] {""} ;
      P03XP4_n456FasActTin = new boolean[] {false} ;
      P03XP4_A4286FasForMul = new String[] {""} ;
      P03XP4_n4286FasForMul = new boolean[] {false} ;
      P03XP4_A2319For_UltL = new short[1] ;
      P03XP4_n2319For_UltL = new boolean[] {false} ;
      P03XP4_A7744FasPreObl = new byte[1] ;
      P03XP4_n7744FasPreObl = new boolean[] {false} ;
      P03XP4_A457FasCod = new String[] {""} ;
      P03XP4_n457FasCod = new boolean[] {false} ;
      A456FasActTin = "" ;
      A4286FasForMul = "" ;
      A457FasCod = "" ;
      AV22FasCod = "" ;
      W457FasCod = "" ;
      P03XP6_A252CliCod = new int[1] ;
      P03XP6_A494ForSer = new String[] {""} ;
      P03XP6_A482ForColNom = new String[] {""} ;
      P03XP6_A483ForColNum = new int[1] ;
      P03XP6_A831TipColCod = new byte[1] ;
      P03XP6_A853For_ProC = new String[] {""} ;
      P03XP6_A1028For_Ord = new int[1] ;
      P03XP6_A2320For_Lin = new short[1] ;
      P03XP6_A396EmprCod = new String[] {""} ;
      P03XP6_A2321For_PqC = new String[] {""} ;
      P03XP6_n2321For_PqC = new boolean[] {false} ;
      A2321For_PqC = "" ;
      A2322For_PqD = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      A764ProForCod = "" ;
      A5489DisQuiDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apbuspro2__default(),
         new Object[] {
             new Object[] {
            P03XP2_A831TipColCod, P03XP2_A483ForColNum, P03XP2_A482ForColNom, P03XP2_A494ForSer, P03XP2_A252CliCod, P03XP2_A853For_ProC, P03XP2_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P03XP4_A396EmprCod, P03XP4_A252CliCod, P03XP4_A494ForSer, P03XP4_A482ForColNom, P03XP4_A483ForColNum, P03XP4_A831TipColCod, P03XP4_A853For_ProC, P03XP4_A1028For_Ord, P03XP4_A456FasActTin, P03XP4_n456FasActTin,
            P03XP4_A4286FasForMul, P03XP4_n4286FasForMul, P03XP4_A2319For_UltL, P03XP4_n2319For_UltL, P03XP4_A7744FasPreObl, P03XP4_n7744FasPreObl, P03XP4_A457FasCod, P03XP4_n457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            P03XP6_A252CliCod, P03XP6_A494ForSer, P03XP6_A482ForColNom, P03XP6_A483ForColNum, P03XP6_A831TipColCod, P03XP6_A853For_ProC, P03XP6_A1028For_Ord, P03XP6_A2320For_Lin, P03XP6_A396EmprCod, P03XP6_A2321For_PqC,
            P03XP6_n2321For_PqC
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV36TipColCod ;
   private byte A831TipColCod ;
   private byte A7744FasPreObl ;
   private short A846UltFasLin ;
   private short Gx_err ;
   private short A2319For_UltL ;
   private short A368DisFasLin ;
   private short A5376DisQuiUl ;
   private short A2320For_Lin ;
   private short A5377DisQuiLin ;
   private short A5378DisQuiNp ;
   private short A5379DisQuiTp ;
   private short A5380DisQuiRb ;
   private int AV16DisCod ;
   private int AV18CliCod ;
   private int AV35ForColNum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int GX_INS38 ;
   private int W361DisCod ;
   private int A361DisCod ;
   private int A1028For_Ord ;
   private int GX_INS39 ;
   private int GX_INS780 ;
   private long AV37NumFase ;
   private String AV15EmprCod ;
   private String AV33ForSer ;
   private String AV34ForColNom ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A853For_ProC ;
   private String A396EmprCod ;
   private String A2318For_ProD ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String W396EmprCod ;
   private String AV19ProCod ;
   private String A758ProCod ;
   private String Gx_emsg ;
   private String A456FasActTin ;
   private String A4286FasForMul ;
   private String A457FasCod ;
   private String AV22FasCod ;
   private String W457FasCod ;
   private String A2321For_PqC ;
   private String A2322For_PqD ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String A764ProForCod ;
   private String A5489DisQuiDsc ;
   private boolean n456FasActTin ;
   private boolean n4286FasForMul ;
   private boolean n2319For_UltL ;
   private boolean n7744FasPreObl ;
   private boolean n457FasCod ;
   private boolean n2321For_PqC ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private IDataStoreProvider pr_default ;
   private byte[] P03XP2_A831TipColCod ;
   private int[] P03XP2_A483ForColNum ;
   private String[] P03XP2_A482ForColNom ;
   private String[] P03XP2_A494ForSer ;
   private int[] P03XP2_A252CliCod ;
   private String[] P03XP2_A853For_ProC ;
   private String[] P03XP2_A396EmprCod ;
   private String[] P03XP4_A396EmprCod ;
   private int[] P03XP4_A252CliCod ;
   private String[] P03XP4_A494ForSer ;
   private String[] P03XP4_A482ForColNom ;
   private int[] P03XP4_A483ForColNum ;
   private byte[] P03XP4_A831TipColCod ;
   private String[] P03XP4_A853For_ProC ;
   private int[] P03XP4_A1028For_Ord ;
   private String[] P03XP4_A456FasActTin ;
   private boolean[] P03XP4_n456FasActTin ;
   private String[] P03XP4_A4286FasForMul ;
   private boolean[] P03XP4_n4286FasForMul ;
   private short[] P03XP4_A2319For_UltL ;
   private boolean[] P03XP4_n2319For_UltL ;
   private byte[] P03XP4_A7744FasPreObl ;
   private boolean[] P03XP4_n7744FasPreObl ;
   private String[] P03XP4_A457FasCod ;
   private boolean[] P03XP4_n457FasCod ;
   private int[] P03XP6_A252CliCod ;
   private String[] P03XP6_A494ForSer ;
   private String[] P03XP6_A482ForColNom ;
   private int[] P03XP6_A483ForColNum ;
   private byte[] P03XP6_A831TipColCod ;
   private String[] P03XP6_A853For_ProC ;
   private int[] P03XP6_A1028For_Ord ;
   private short[] P03XP6_A2320For_Lin ;
   private String[] P03XP6_A396EmprCod ;
   private String[] P03XP6_A2321For_PqC ;
   private boolean[] P03XP6_n2321For_PqC ;
}

final  class apbuspro2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03XP2", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, For_ProC, EmprCod FROM TXPTAB000 WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03XP3", "INSERT INTO TXPDISLIN(EmprCod, DisCod, ProCod, UltFasLin, DisFasApr, ProSts, ProStsFec) VALUES(?, ?, ?, ?, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISLIN")
         ,new ForEachCursor("P03XP4", "SELECT T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.For_ProC, T1.For_Ord, T2.FasActTin, T2.FasForMul, T1.For_UltL, T2.FasPreObl, T1.FasCod FROM (TXPTAB001 T1 LEFT JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? and T1.For_ProC = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.For_ProC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03XP5", "INSERT INTO TXPDISFAS(EmprCod, DisCod, ProCod, DisFasLin, FasCod, DisQuiUl, FasPreObl, FasApr, DisMaqPru, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, Disfastpp, DisFasUpL, DisfasRb, Dta_UOrd, DisFasObs, DisPreSal, DisPrePie, DisVelPro, DisNumPas) VALUES(?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
         ,new ForEachCursor("P03XP6", "SELECT CliCod, ForSer, ForColNom, ForColNum, TipColCod, For_ProC, For_Ord, For_Lin, EmprCod, For_PqC FROM TXPTAB002 WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and For_ProC = ? and For_Ord = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, For_ProC, For_Ord ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03XP7", "INSERT INTO TXPDISQUI(EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin, ProForCod, DisQuiNp, DisQuiTp, DisQuiRb, DisQuiDsc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISQUI")
         ,new UpdateCursor("P03XP8", "UPDATE TXPDISLIN SET UltFasLin=?  WHERE EmprCod = ? and DisCod = ? and ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISLIN")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 8);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[8]).byteValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 20);
               return;
            case 6 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 8);
               return;
      }
   }

}

