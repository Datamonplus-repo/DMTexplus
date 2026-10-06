package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palrpieuti extends GXProcedure
{
   public palrpieuti( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palrpieuti.class ), "" );
   }

   public palrpieuti( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      palrpieuti.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      palrpieuti.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palrpieuti.this.AV11ALbreccod = aP1[0];
      this.aP1 = aP1;
      palrpieuti.this.AV9BarPieCod = aP2[0];
      this.aP2 = aP2;
      palrpieuti.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV13DivisionRollos ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EST000", ""), GXv_int2) ;
      palrpieuti.this.GXt_int1 = GXv_int2[0] ;
      AV13DivisionRollos = GXt_int1 ;
      AV8PieUti = "" ;
      AV10TBarpie = (byte)(0) ;
      AV14LastHdr = "" ;
      /* Using cursor P01622 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV11ALbreccod), AV9BarPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P01622_A44AlbRecCod[0] ;
         n44AlbRecCod = P01622_n44AlbRecCod[0] ;
         A200BarPieCod = P01622_A200BarPieCod[0] ;
         A130BarCodPar = P01622_A130BarCodPar[0] ;
         A132BarCodReo = P01622_A132BarCodReo[0] ;
         A129BarCod = P01622_A129BarCod[0] ;
         A56AlbRUni = P01622_A56AlbRUni[0] ;
         A203BarPieKil = P01622_A203BarPieKil[0] ;
         A205BarPieMet = P01622_A205BarPieMet[0] ;
         A56AlbRUni = P01622_A56AlbRUni[0] ;
         AV10TBarpie = (byte)(1) ;
         if ( ! (GXutil.strcmp("", AV8PieUti)==0) )
         {
            AV8PieUti += "; " ;
         }
         AV8PieUti += httpContext.getMessage( "Hdr ", "") + GXutil.trim( GXutil.str( A129BarCod, 10, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 10, 0)) + GXutil.trim( A130BarCodPar) + ", " ;
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            AV8PieUti += GXutil.trim( GXutil.str( A203BarPieKil, 9, 2)) ;
         }
         else
         {
            AV8PieUti += GXutil.trim( GXutil.str( A205BarPieMet, 9, 2)) ;
         }
         AV14LastHdr = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV13DivisionRollos == 1 )
      {
         /* Using cursor P01623 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV11ALbreccod), AV9BarPieCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A44AlbRecCod = P01623_A44AlbRecCod[0] ;
            n44AlbRecCod = P01623_n44AlbRecCod[0] ;
            A908PieOriCod = P01623_A908PieOriCod[0] ;
            A130BarCodPar = P01623_A130BarCodPar[0] ;
            A132BarCodReo = P01623_A132BarCodReo[0] ;
            A129BarCod = P01623_A129BarCod[0] ;
            A56AlbRUni = P01623_A56AlbRUni[0] ;
            A203BarPieKil = P01623_A203BarPieKil[0] ;
            A205BarPieMet = P01623_A205BarPieMet[0] ;
            A200BarPieCod = P01623_A200BarPieCod[0] ;
            A56AlbRUni = P01623_A56AlbRUni[0] ;
            AV10TBarpie = (byte)(1) ;
            if ( ! (GXutil.strcmp("", AV8PieUti)==0) )
            {
               AV8PieUti += "; " ;
            }
            AV8PieUti += httpContext.getMessage( "Hdr ", "") + GXutil.trim( GXutil.str( A129BarCod, 10, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 10, 0)) + GXutil.trim( A130BarCodPar) + ", " ;
            if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
            {
               AV8PieUti += GXutil.trim( GXutil.str( A203BarPieKil, 9, 2)) ;
            }
            else
            {
               AV8PieUti += GXutil.trim( GXutil.str( A205BarPieMet, 9, 2)) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      if ( AV10TBarpie == 0 )
      {
         /* Using cursor P01624 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV11ALbreccod), AV9BarPieCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A44AlbRecCod = P01624_A44AlbRecCod[0] ;
            n44AlbRecCod = P01624_n44AlbRecCod[0] ;
            A380DisPieCod = P01624_A380DisPieCod[0] ;
            A361DisCod = P01624_A361DisCod[0] ;
            A56AlbRUni = P01624_A56AlbRUni[0] ;
            A382DisPieKil = P01624_A382DisPieKil[0] ;
            A384DisPieMet = P01624_A384DisPieMet[0] ;
            A56AlbRUni = P01624_A56AlbRUni[0] ;
            if ( ! (GXutil.strcmp("", AV8PieUti)==0) )
            {
               AV8PieUti += "; " ;
            }
            AV8PieUti += httpContext.getMessage( "NDp ", "") + GXutil.trim( GXutil.str( A361DisCod, 10, 0)) + ", " ;
            if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
            {
               AV8PieUti += GXutil.trim( GXutil.str( A382DisPieKil, 9, 2)) ;
            }
            else
            {
               AV8PieUti += GXutil.trim( GXutil.str( A384DisPieMet, 9, 2)) ;
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
      }
      if ( (GXutil.strcmp("", AV8PieUti)==0) )
      {
         AV12DevPie = (byte)(0) ;
         /* Using cursor P01625 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV11ALbreccod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A56AlbRUni = P01625_A56AlbRUni[0] ;
            A323DevGenCod = P01625_A323DevGenCod[0] ;
            A44AlbRecCod = P01625_A44AlbRecCod[0] ;
            n44AlbRecCod = P01625_n44AlbRecCod[0] ;
            A56AlbRUni = P01625_A56AlbRUni[0] ;
            W44AlbRecCod = A44AlbRecCod ;
            n44AlbRecCod = false ;
            /* Using cursor P01626 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), AV9BarPieCod});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A44AlbRecCod = P01626_A44AlbRecCod[0] ;
               n44AlbRecCod = P01626_n44AlbRecCod[0] ;
               A2159AlbRecPie = P01626_A2159AlbRecPie[0] ;
               A2156AlbRecKgmU = P01626_A2156AlbRecKgmU[0] ;
               A2158AlbRecMtrU = P01626_A2158AlbRecMtrU[0] ;
               A44AlbRecCod = P01626_A44AlbRecCod[0] ;
               n44AlbRecCod = P01626_n44AlbRecCod[0] ;
               A2156AlbRecKgmU = P01626_A2156AlbRecKgmU[0] ;
               A2158AlbRecMtrU = P01626_A2158AlbRecMtrU[0] ;
               AV12DevPie = (byte)(1) ;
               if ( ! (GXutil.strcmp("", AV8PieUti)==0) )
               {
                  AV8PieUti += "; " ;
               }
               AV8PieUti += httpContext.getMessage( "Dev ", "") + GXutil.trim( GXutil.str( A323DevGenCod, 10, 0)) + ", " ;
               if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
               {
                  AV8PieUti += GXutil.trim( GXutil.str( A2156AlbRecKgmU, 9, 2)) ;
               }
               else
               {
                  AV8PieUti += GXutil.trim( GXutil.str( A2158AlbRecMtrU, 9, 2)) ;
               }
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(4);
            A44AlbRecCod = W44AlbRecCod ;
            n44AlbRecCod = false ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         if ( AV12DevPie == 0 )
         {
            AV8PieUti = httpContext.getMessage( "N/U", "") ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palrpieuti.this.A396EmprCod;
      this.aP1[0] = palrpieuti.this.AV11ALbreccod;
      this.aP2[0] = palrpieuti.this.AV9BarPieCod;
      this.aP3[0] = palrpieuti.this.AV8PieUti;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8PieUti = "" ;
      GXv_int2 = new byte[1] ;
      AV14LastHdr = "" ;
      scmdbuf = "" ;
      P01622_A396EmprCod = new String[] {""} ;
      P01622_A44AlbRecCod = new int[1] ;
      P01622_n44AlbRecCod = new boolean[] {false} ;
      P01622_A200BarPieCod = new String[] {""} ;
      P01622_A130BarCodPar = new String[] {""} ;
      P01622_A132BarCodReo = new byte[1] ;
      P01622_A129BarCod = new int[1] ;
      P01622_A56AlbRUni = new String[] {""} ;
      P01622_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01622_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A200BarPieCod = "" ;
      A130BarCodPar = "" ;
      A56AlbRUni = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      P01623_A396EmprCod = new String[] {""} ;
      P01623_A44AlbRecCod = new int[1] ;
      P01623_n44AlbRecCod = new boolean[] {false} ;
      P01623_A908PieOriCod = new String[] {""} ;
      P01623_A130BarCodPar = new String[] {""} ;
      P01623_A132BarCodReo = new byte[1] ;
      P01623_A129BarCod = new int[1] ;
      P01623_A56AlbRUni = new String[] {""} ;
      P01623_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01623_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01623_A200BarPieCod = new String[] {""} ;
      A908PieOriCod = "" ;
      P01624_A396EmprCod = new String[] {""} ;
      P01624_A44AlbRecCod = new int[1] ;
      P01624_n44AlbRecCod = new boolean[] {false} ;
      P01624_A380DisPieCod = new String[] {""} ;
      P01624_A361DisCod = new int[1] ;
      P01624_A56AlbRUni = new String[] {""} ;
      P01624_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01624_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A380DisPieCod = "" ;
      A382DisPieKil = DecimalUtil.ZERO ;
      A384DisPieMet = DecimalUtil.ZERO ;
      P01625_A396EmprCod = new String[] {""} ;
      P01625_A56AlbRUni = new String[] {""} ;
      P01625_A323DevGenCod = new int[1] ;
      P01625_A44AlbRecCod = new int[1] ;
      P01625_n44AlbRecCod = new boolean[] {false} ;
      P01626_A44AlbRecCod = new int[1] ;
      P01626_n44AlbRecCod = new boolean[] {false} ;
      P01626_A396EmprCod = new String[] {""} ;
      P01626_A323DevGenCod = new int[1] ;
      P01626_A2159AlbRecPie = new String[] {""} ;
      P01626_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01626_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A2159AlbRecPie = "" ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palrpieuti__default(),
         new Object[] {
             new Object[] {
            P01622_A396EmprCod, P01622_A44AlbRecCod, P01622_A200BarPieCod, P01622_A130BarCodPar, P01622_A132BarCodReo, P01622_A129BarCod, P01622_A56AlbRUni, P01622_A203BarPieKil, P01622_A205BarPieMet
            }
            , new Object[] {
            P01623_A396EmprCod, P01623_A44AlbRecCod, P01623_A908PieOriCod, P01623_A130BarCodPar, P01623_A132BarCodReo, P01623_A129BarCod, P01623_A56AlbRUni, P01623_A203BarPieKil, P01623_A205BarPieMet, P01623_A200BarPieCod
            }
            , new Object[] {
            P01624_A396EmprCod, P01624_A44AlbRecCod, P01624_A380DisPieCod, P01624_A361DisCod, P01624_A56AlbRUni, P01624_A382DisPieKil, P01624_A384DisPieMet
            }
            , new Object[] {
            P01625_A396EmprCod, P01625_A56AlbRUni, P01625_A323DevGenCod, P01625_A44AlbRecCod, P01625_n44AlbRecCod
            }
            , new Object[] {
            P01626_A44AlbRecCod, P01626_n44AlbRecCod, P01626_A396EmprCod, P01626_A323DevGenCod, P01626_A2159AlbRecPie, P01626_A2156AlbRecKgmU, P01626_A2158AlbRecMtrU
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13DivisionRollos ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV10TBarpie ;
   private byte A132BarCodReo ;
   private byte AV12DevPie ;
   private short Gx_err ;
   private int AV11ALbreccod ;
   private int A44AlbRecCod ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A323DevGenCod ;
   private int W44AlbRecCod ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A382DisPieKil ;
   private java.math.BigDecimal A384DisPieMet ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private String A396EmprCod ;
   private String AV9BarPieCod ;
   private String AV8PieUti ;
   private String AV14LastHdr ;
   private String scmdbuf ;
   private String A200BarPieCod ;
   private String A130BarCodPar ;
   private String A56AlbRUni ;
   private String A908PieOriCod ;
   private String A380DisPieCod ;
   private String A2159AlbRecPie ;
   private boolean n44AlbRecCod ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01622_A396EmprCod ;
   private int[] P01622_A44AlbRecCod ;
   private boolean[] P01622_n44AlbRecCod ;
   private String[] P01622_A200BarPieCod ;
   private String[] P01622_A130BarCodPar ;
   private byte[] P01622_A132BarCodReo ;
   private int[] P01622_A129BarCod ;
   private String[] P01622_A56AlbRUni ;
   private java.math.BigDecimal[] P01622_A203BarPieKil ;
   private java.math.BigDecimal[] P01622_A205BarPieMet ;
   private String[] P01623_A396EmprCod ;
   private int[] P01623_A44AlbRecCod ;
   private boolean[] P01623_n44AlbRecCod ;
   private String[] P01623_A908PieOriCod ;
   private String[] P01623_A130BarCodPar ;
   private byte[] P01623_A132BarCodReo ;
   private int[] P01623_A129BarCod ;
   private String[] P01623_A56AlbRUni ;
   private java.math.BigDecimal[] P01623_A203BarPieKil ;
   private java.math.BigDecimal[] P01623_A205BarPieMet ;
   private String[] P01623_A200BarPieCod ;
   private String[] P01624_A396EmprCod ;
   private int[] P01624_A44AlbRecCod ;
   private boolean[] P01624_n44AlbRecCod ;
   private String[] P01624_A380DisPieCod ;
   private int[] P01624_A361DisCod ;
   private String[] P01624_A56AlbRUni ;
   private java.math.BigDecimal[] P01624_A382DisPieKil ;
   private java.math.BigDecimal[] P01624_A384DisPieMet ;
   private String[] P01625_A396EmprCod ;
   private String[] P01625_A56AlbRUni ;
   private int[] P01625_A323DevGenCod ;
   private int[] P01625_A44AlbRecCod ;
   private boolean[] P01625_n44AlbRecCod ;
   private int[] P01626_A44AlbRecCod ;
   private boolean[] P01626_n44AlbRecCod ;
   private String[] P01626_A396EmprCod ;
   private int[] P01626_A323DevGenCod ;
   private String[] P01626_A2159AlbRecPie ;
   private java.math.BigDecimal[] P01626_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] P01626_A2158AlbRecMtrU ;
}

final  class palrpieuti__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01622", "SELECT T1.EmprCod, T1.AlbRecCod, T1.BarPieCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.AlbRUni, T1.BarPieKil, T1.BarPieMet FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? and T1.BarPieCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01623", "SELECT T1.EmprCod, T1.AlbRecCod, T1.PieOriCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.AlbRUni, T1.BarPieKil, T1.BarPieMet, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? and T1.PieOriCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod, T1.PieOriCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01624", "SELECT T1.EmprCod, T1.AlbRecCod, T1.DisPieCod, T1.DisCod, T2.AlbRUni, T1.DisPieKil, T1.DisPieMet FROM (TXPDISALD T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? and T1.DisPieCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod, T1.DisPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01625", "SELECT T1.EmprCod, T2.AlbRUni, T1.DevGenCod, T1.AlbRecCod FROM (TXPDEVGEN T1 LEFT JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01626", "SELECT T2.AlbRecCod, T1.EmprCod, T1.DevGenCod, T1.AlbRecPie, T3.AlbRecKgmU, T3.AlbRecMtrU FROM ((TXPDevPie T1 INNER JOIN TXPDEVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.DevGenCod = T1.DevGenCod) LEFT JOIN TXPALBDET T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbRecCod = T2.AlbRecCod AND T3.AlbRecPie = T1.AlbRecPie) WHERE T1.EmprCod = ? and T1.DevGenCod = ? and T1.AlbRecPie = ? ORDER BY T1.EmprCod, T1.DevGenCod, T1.AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
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
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
      }
   }

}

