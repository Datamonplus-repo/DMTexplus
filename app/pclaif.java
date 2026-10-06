package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclaif extends GXProcedure
{
   public pclaif( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclaif.class ), "" );
   }

   public pclaif( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 ,
                             byte[] aP11 )
   {
      pclaif.this.aP12 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        short[] aP10 ,
                        byte[] aP11 ,
                        String[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 ,
                             byte[] aP11 ,
                             String[] aP12 )
   {
      pclaif.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclaif.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclaif.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclaif.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclaif.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      pclaif.this.AV19BarCodReo = aP5[0];
      this.aP5 = aP5;
      pclaif.this.AV20BarCodPar = aP6[0];
      this.aP6 = aP6;
      pclaif.this.AV21TotKil = aP7[0];
      this.aP7 = aP7;
      pclaif.this.AV22PrdDesc = aP8[0];
      this.aP8 = aP8;
      pclaif.this.AV23Accion = aP9[0];
      this.aP9 = aP9;
      pclaif.this.AV67BarLinMaq = aP10[0];
      this.aP10 = aP10;
      pclaif.this.AV112Opi = aP11[0];
      this.aP11 = aP11;
      pclaif.this.AV113Barfactin = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV111F_Reccol = (byte)(0) ;
      GXv_int1[0] = AV111F_Reccol ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RECCOL", ""), GXv_int1) ;
      pclaif.this.AV111F_Reccol = GXv_int1[0] ;
      AV114Fase_nt = (byte)(0) ;
      /* Using cursor P01Q82 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV67BarLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P01Q82_A2804RecLinMaq[0] ;
         A130BarCodPar = P01Q82_A130BarCodPar[0] ;
         A132BarCodReo = P01Q82_A132BarCodReo[0] ;
         A129BarCod = P01Q82_A129BarCod[0] ;
         A5408RecLinCol = P01Q82_A5408RecLinCol[0] ;
         AV114Fase_nt = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV23Accion = GXutil.substring( AV16Clave, 10, 1) ;
      AV51IntCod = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 4, 2))) ;
      AV91Family = GXutil.substring( AV16Clave, 7, 2) ;
      if ( ( ( AV111F_Reccol == 1 ) && ( AV112Opi == 0 ) ) || ( ( AV111F_Reccol == 1 ) && ( AV114Fase_nt == 1 ) ) )
      {
         AV95Ok_intens = (byte)(0) ;
         /* Using cursor P01Q83 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV67BarLinMaq)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2804RecLinMaq = P01Q83_A2804RecLinMaq[0] ;
            A130BarCodPar = P01Q83_A130BarCodPar[0] ;
            A132BarCodReo = P01Q83_A132BarCodReo[0] ;
            A129BarCod = P01Q83_A129BarCod[0] ;
            A5412RecIntCol = P01Q83_A5412RecIntCol[0] ;
            n5412RecIntCol = P01Q83_n5412RecIntCol[0] ;
            if ( AV51IntCod == A5412RecIntCol )
            {
               AV95Ok_intens = (byte)(1) ;
            }
            AV94Ok_family = (byte)(0) ;
            /* Using cursor P01Q84 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A5409RecPrdCol = P01Q84_A5409RecPrdCol[0] ;
               n5409RecPrdCol = P01Q84_n5409RecPrdCol[0] ;
               A5408RecLinCol = P01Q84_A5408RecLinCol[0] ;
               AV93Length = (byte)(GXutil.len( A5409RecPrdCol)) ;
               if ( AV93Length > 5 )
               {
                  if ( DecimalUtil.compareTo(CommonUtil.decimalVal( GXutil.substring( A5409RecPrdCol, 1, 2), "."), CommonUtil.decimalVal( AV91Family, ".")) == 0 )
                  {
                     AV94Ok_family = (byte)(1) ;
                  }
               }
               else
               {
                  AV96FamiliaA = GXutil.substring( AV91Family, 1, 1) ;
                  if ( GXutil.strcmp(GXutil.substring( A5409RecPrdCol, 1, 1), AV96FamiliaA) == 0 )
                  {
                     AV94Ok_family = (byte)(1) ;
                  }
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      else
      {
         /* Using cursor P01Q85 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A130BarCodPar = P01Q85_A130BarCodPar[0] ;
            A132BarCodReo = P01Q85_A132BarCodReo[0] ;
            A129BarCod = P01Q85_A129BarCod[0] ;
            A252CliCod = P01Q85_A252CliCod[0] ;
            n252CliCod = P01Q85_n252CliCod[0] ;
            A212BarSer = P01Q85_A212BarSer[0] ;
            A135BarColNom = P01Q85_A135BarColNom[0] ;
            A136BarColNum = P01Q85_A136BarColNum[0] ;
            A218BarTipCol = P01Q85_A218BarTipCol[0] ;
            AV41BarCliCod = A252CliCod ;
            AV46ForSer = A212BarSer ;
            AV47ForColNom = A135BarColNom ;
            AV48ForColNum = A136BarColNum ;
            AV49TipColCod = A218BarTipCol ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         /* Execute user subroutine: 'INTENS' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'COLORANTES' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( ( AV94Ok_family == 1 ) && ( AV95Ok_intens == 1 ) )
      {
         AV17PrdVal = (byte)(1) ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'INTENS' Routine */
      returnInSub = false ;
      AV92ForNumCol = 0 ;
      AV95Ok_intens = (byte)(0) ;
      /* Using cursor P01Q86 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV41BarCliCod), AV46ForSer, AV47ForColNom, Integer.valueOf(AV48ForColNum), Byte.valueOf(AV49TipColCod), Byte.valueOf(AV51IntCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A583IntCod = P01Q86_A583IntCod[0] ;
         A831TipColCod = P01Q86_A831TipColCod[0] ;
         A483ForColNum = P01Q86_A483ForColNum[0] ;
         A482ForColNom = P01Q86_A482ForColNom[0] ;
         A494ForSer = P01Q86_A494ForSer[0] ;
         A252CliCod = P01Q86_A252CliCod[0] ;
         n252CliCod = P01Q86_n252CliCod[0] ;
         A486ForNumCol = P01Q86_A486ForNumCol[0] ;
         AV95Ok_intens = (byte)(1) ;
         AV92ForNumCol = A486ForNumCol ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S121( )
   {
      /* 'COLORANTES' Routine */
      returnInSub = false ;
      AV94Ok_family = (byte)(0) ;
      /* Using cursor P01Q87 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV92ForNumCol)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A486ForNumCol = P01Q87_A486ForNumCol[0] ;
         A719PrdNum = P01Q87_A719PrdNum[0] ;
         A309ColLin = P01Q87_A309ColLin[0] ;
         AV93Length = (byte)(GXutil.len( A719PrdNum)) ;
         if ( AV93Length > 5 )
         {
            if ( DecimalUtil.compareTo(CommonUtil.decimalVal( GXutil.substring( A719PrdNum, 1, 2), "."), CommonUtil.decimalVal( AV91Family, ".")) == 0 )
            {
               AV94Ok_family = (byte)(1) ;
            }
         }
         else
         {
            AV96FamiliaA = GXutil.substring( AV91Family, 1, 1) ;
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), AV96FamiliaA) == 0 )
            {
               AV94Ok_family = (byte)(1) ;
            }
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclaif.this.A396EmprCod;
      this.aP1[0] = pclaif.this.AV15Descrip;
      this.aP2[0] = pclaif.this.AV16Clave;
      this.aP3[0] = pclaif.this.AV17PrdVal;
      this.aP4[0] = pclaif.this.AV18BarCod;
      this.aP5[0] = pclaif.this.AV19BarCodReo;
      this.aP6[0] = pclaif.this.AV20BarCodPar;
      this.aP7[0] = pclaif.this.AV21TotKil;
      this.aP8[0] = pclaif.this.AV22PrdDesc;
      this.aP9[0] = pclaif.this.AV23Accion;
      this.aP10[0] = pclaif.this.AV67BarLinMaq;
      this.aP11[0] = pclaif.this.AV112Opi;
      this.aP12[0] = pclaif.this.AV113Barfactin;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P01Q82_A396EmprCod = new String[] {""} ;
      P01Q82_A2804RecLinMaq = new short[1] ;
      P01Q82_A130BarCodPar = new String[] {""} ;
      P01Q82_A132BarCodReo = new byte[1] ;
      P01Q82_A129BarCod = new int[1] ;
      P01Q82_A5408RecLinCol = new short[1] ;
      A130BarCodPar = "" ;
      AV91Family = "" ;
      P01Q83_A396EmprCod = new String[] {""} ;
      P01Q83_A2804RecLinMaq = new short[1] ;
      P01Q83_A130BarCodPar = new String[] {""} ;
      P01Q83_A132BarCodReo = new byte[1] ;
      P01Q83_A129BarCod = new int[1] ;
      P01Q83_A5412RecIntCol = new byte[1] ;
      P01Q83_n5412RecIntCol = new boolean[] {false} ;
      P01Q84_A396EmprCod = new String[] {""} ;
      P01Q84_A129BarCod = new int[1] ;
      P01Q84_A132BarCodReo = new byte[1] ;
      P01Q84_A130BarCodPar = new String[] {""} ;
      P01Q84_A2804RecLinMaq = new short[1] ;
      P01Q84_A5409RecPrdCol = new String[] {""} ;
      P01Q84_n5409RecPrdCol = new boolean[] {false} ;
      P01Q84_A5408RecLinCol = new short[1] ;
      A5409RecPrdCol = "" ;
      AV96FamiliaA = "" ;
      P01Q85_A396EmprCod = new String[] {""} ;
      P01Q85_A130BarCodPar = new String[] {""} ;
      P01Q85_A132BarCodReo = new byte[1] ;
      P01Q85_A129BarCod = new int[1] ;
      P01Q85_A252CliCod = new int[1] ;
      P01Q85_n252CliCod = new boolean[] {false} ;
      P01Q85_A212BarSer = new String[] {""} ;
      P01Q85_A135BarColNom = new String[] {""} ;
      P01Q85_A136BarColNum = new int[1] ;
      P01Q85_A218BarTipCol = new byte[1] ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      AV46ForSer = "" ;
      AV47ForColNom = "" ;
      P01Q86_A396EmprCod = new String[] {""} ;
      P01Q86_A583IntCod = new byte[1] ;
      P01Q86_A831TipColCod = new byte[1] ;
      P01Q86_A483ForColNum = new int[1] ;
      P01Q86_A482ForColNom = new String[] {""} ;
      P01Q86_A494ForSer = new String[] {""} ;
      P01Q86_A252CliCod = new int[1] ;
      P01Q86_n252CliCod = new boolean[] {false} ;
      P01Q86_A486ForNumCol = new int[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      P01Q87_A396EmprCod = new String[] {""} ;
      P01Q87_A486ForNumCol = new int[1] ;
      P01Q87_A719PrdNum = new String[] {""} ;
      P01Q87_A309ColLin = new short[1] ;
      A719PrdNum = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclaif__default(),
         new Object[] {
             new Object[] {
            P01Q82_A396EmprCod, P01Q82_A2804RecLinMaq, P01Q82_A130BarCodPar, P01Q82_A132BarCodReo, P01Q82_A129BarCod, P01Q82_A5408RecLinCol
            }
            , new Object[] {
            P01Q83_A396EmprCod, P01Q83_A2804RecLinMaq, P01Q83_A130BarCodPar, P01Q83_A132BarCodReo, P01Q83_A129BarCod, P01Q83_A5412RecIntCol, P01Q83_n5412RecIntCol
            }
            , new Object[] {
            P01Q84_A396EmprCod, P01Q84_A129BarCod, P01Q84_A132BarCodReo, P01Q84_A130BarCodPar, P01Q84_A2804RecLinMaq, P01Q84_A5409RecPrdCol, P01Q84_n5409RecPrdCol, P01Q84_A5408RecLinCol
            }
            , new Object[] {
            P01Q85_A396EmprCod, P01Q85_A130BarCodPar, P01Q85_A132BarCodReo, P01Q85_A129BarCod, P01Q85_A252CliCod, P01Q85_n252CliCod, P01Q85_A212BarSer, P01Q85_A135BarColNom, P01Q85_A136BarColNum, P01Q85_A218BarTipCol
            }
            , new Object[] {
            P01Q86_A396EmprCod, P01Q86_A583IntCod, P01Q86_A831TipColCod, P01Q86_A483ForColNum, P01Q86_A482ForColNom, P01Q86_A494ForSer, P01Q86_A252CliCod, P01Q86_A486ForNumCol
            }
            , new Object[] {
            P01Q87_A396EmprCod, P01Q87_A486ForNumCol, P01Q87_A719PrdNum, P01Q87_A309ColLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV19BarCodReo ;
   private byte AV112Opi ;
   private byte AV111F_Reccol ;
   private byte GXv_int1[] ;
   private byte AV114Fase_nt ;
   private byte A132BarCodReo ;
   private byte AV51IntCod ;
   private byte AV95Ok_intens ;
   private byte A5412RecIntCol ;
   private byte AV94Ok_family ;
   private byte AV93Length ;
   private byte A218BarTipCol ;
   private byte AV49TipColCod ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private short AV67BarLinMaq ;
   private short A2804RecLinMaq ;
   private short A5408RecLinCol ;
   private short A309ColLin ;
   private short Gx_err ;
   private int AV18BarCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV41BarCliCod ;
   private int AV48ForColNum ;
   private int AV92ForNumCol ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private java.math.BigDecimal AV21TotKil ;
   private String A396EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV20BarCodPar ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String AV113Barfactin ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String AV91Family ;
   private String A5409RecPrdCol ;
   private String AV96FamiliaA ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String AV46ForSer ;
   private String AV47ForColNom ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A719PrdNum ;
   private boolean n5412RecIntCol ;
   private boolean n5409RecPrdCol ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private String[] aP12 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private short[] aP10 ;
   private byte[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P01Q82_A396EmprCod ;
   private short[] P01Q82_A2804RecLinMaq ;
   private String[] P01Q82_A130BarCodPar ;
   private byte[] P01Q82_A132BarCodReo ;
   private int[] P01Q82_A129BarCod ;
   private short[] P01Q82_A5408RecLinCol ;
   private String[] P01Q83_A396EmprCod ;
   private short[] P01Q83_A2804RecLinMaq ;
   private String[] P01Q83_A130BarCodPar ;
   private byte[] P01Q83_A132BarCodReo ;
   private int[] P01Q83_A129BarCod ;
   private byte[] P01Q83_A5412RecIntCol ;
   private boolean[] P01Q83_n5412RecIntCol ;
   private String[] P01Q84_A396EmprCod ;
   private int[] P01Q84_A129BarCod ;
   private byte[] P01Q84_A132BarCodReo ;
   private String[] P01Q84_A130BarCodPar ;
   private short[] P01Q84_A2804RecLinMaq ;
   private String[] P01Q84_A5409RecPrdCol ;
   private boolean[] P01Q84_n5409RecPrdCol ;
   private short[] P01Q84_A5408RecLinCol ;
   private String[] P01Q85_A396EmprCod ;
   private String[] P01Q85_A130BarCodPar ;
   private byte[] P01Q85_A132BarCodReo ;
   private int[] P01Q85_A129BarCod ;
   private int[] P01Q85_A252CliCod ;
   private boolean[] P01Q85_n252CliCod ;
   private String[] P01Q85_A212BarSer ;
   private String[] P01Q85_A135BarColNom ;
   private int[] P01Q85_A136BarColNum ;
   private byte[] P01Q85_A218BarTipCol ;
   private String[] P01Q86_A396EmprCod ;
   private byte[] P01Q86_A583IntCod ;
   private byte[] P01Q86_A831TipColCod ;
   private int[] P01Q86_A483ForColNum ;
   private String[] P01Q86_A482ForColNom ;
   private String[] P01Q86_A494ForSer ;
   private int[] P01Q86_A252CliCod ;
   private boolean[] P01Q86_n252CliCod ;
   private int[] P01Q86_A486ForNumCol ;
   private String[] P01Q87_A396EmprCod ;
   private int[] P01Q87_A486ForNumCol ;
   private String[] P01Q87_A719PrdNum ;
   private short[] P01Q87_A309ColLin ;
}

final  class pclaif__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01Q82", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, RecLinCol FROM TXPRECCOL WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01Q83", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, RecIntCol FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01Q84", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecPrdCol, RecLinCol FROM TXPRECCOL WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01Q85", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01Q86", "SELECT EmprCod, IntCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForNumCol FROM TXPCFORMU WHERE (EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?) AND (IntCod = ?) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01Q87", "SELECT EmprCod, ForNumCol, PrdNum, ColLin FROM TXPLDFORM WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol, ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

