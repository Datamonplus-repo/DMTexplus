package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnewccs extends GXProcedure
{
   public pnewccs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnewccs.class ), "" );
   }

   public pnewccs( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     String[] aP1 ,
                                     java.math.BigDecimal[] aP2 ,
                                     java.math.BigDecimal[] aP3 ,
                                     String[] aP4 ,
                                     String[] aP5 ,
                                     java.math.BigDecimal[] aP6 ,
                                     int[] aP7 ,
                                     byte[] aP8 ,
                                     String[] aP9 ,
                                     int[] aP10 ,
                                     String[] aP11 ,
                                     String[] aP12 ,
                                     String[] aP13 ,
                                     short[] aP14 ,
                                     java.math.BigDecimal[] aP15 ,
                                     java.math.BigDecimal[] aP16 )
   {
      pnewccs.this.aP17 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17);
      return aP17[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        int[] aP7 ,
                        byte[] aP8 ,
                        String[] aP9 ,
                        int[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        String[] aP13 ,
                        short[] aP14 ,
                        java.math.BigDecimal[] aP15 ,
                        java.math.BigDecimal[] aP16 ,
                        java.util.Date[] aP17 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             int[] aP7 ,
                             byte[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 ,
                             short[] aP14 ,
                             java.math.BigDecimal[] aP15 ,
                             java.math.BigDecimal[] aP16 ,
                             java.util.Date[] aP17 )
   {
      pnewccs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnewccs.this.AV8PrdNum = aP1[0];
      this.aP1 = aP1;
      pnewccs.this.AV9CCStkCanE = aP2[0];
      this.aP2 = aP2;
      pnewccs.this.AV10CCStkCanS = aP3[0];
      this.aP3 = aP3;
      pnewccs.this.AV11TipMovCc = aP4[0];
      this.aP4 = aP4;
      pnewccs.this.AV12CCStkPri = aP5[0];
      this.aP5 = aP5;
      pnewccs.this.AV13CCStkPre = aP6[0];
      this.aP6 = aP6;
      pnewccs.this.AV14CCStkBar = aP7[0];
      this.aP7 = aP7;
      pnewccs.this.AV15CCStkReo = aP8[0];
      this.aP8 = aP8;
      pnewccs.this.AV16CCStkPar = aP9[0];
      this.aP9 = aP9;
      pnewccs.this.AV17CCStkPed = aP10[0];
      this.aP10 = aP10;
      pnewccs.this.AV18CCStkAlb = aP11[0];
      this.aP11 = aP11;
      pnewccs.this.AV19CCStkUsu = aP12[0];
      this.aP12 = aP12;
      pnewccs.this.AV20CCStkDsc = aP13[0];
      this.aP13 = aP13;
      pnewccs.this.AV21CCStkLen = aP14[0];
      this.aP14 = aP14;
      pnewccs.this.AV24OldCanE = aP15[0];
      this.aP15 = aP15;
      pnewccs.this.AV25OldCanS = aP16[0];
      this.aP16 = aP16;
      pnewccs.this.AV26Fecha = aP17[0];
      this.aP17 = aP17;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27FlagMab = (byte)(0) ;
      GXv_int1[0] = AV27FlagMab ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MABERA", ""), GXv_int1) ;
      pnewccs.this.AV27FlagMab = GXv_int1[0] ;
      GXv_int1[0] = AV31NCLec ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int1) ;
      pnewccs.this.AV31NCLec = GXv_int1[0] ;
      if ( AV27FlagMab == 1 )
      {
      }
      else
      {
         /* Using cursor P00MV2 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV8PrdNum});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A719PrdNum = P00MV2_A719PrdNum[0] ;
            A3341CCStKULin = P00MV2_A3341CCStKULin[0] ;
            n3341CCStKULin = P00MV2_n3341CCStKULin[0] ;
            AV22CCStkULin = A3341CCStKULin ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      AV22CCStkULin = (long)(AV22CCStkULin+5) ;
      AV23FlagEn = (byte)(0) ;
      if ( ( ( GXutil.strcmp(AV11TipMovCc, httpContext.getMessage( "EN", "")) == 0 ) ) || ( ( GXutil.strcmp(AV11TipMovCc, httpContext.getMessage( "SA", "")) == 0 ) ) )
      {
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = AV8PrdNum ;
         GXv_int4[0] = AV21CCStkLen ;
         GXv_decimal5[0] = AV9CCStkCanE ;
         GXv_decimal6[0] = AV24OldCanE ;
         GXv_decimal7[0] = AV10CCStkCanS ;
         GXv_decimal8[0] = AV25OldCanS ;
         GXv_int1[0] = AV23FlagEn ;
         new app.pnewcc1(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4, GXv_decimal5, GXv_decimal6, GXv_decimal7, GXv_decimal8, GXv_int1) ;
         pnewccs.this.A396EmprCod = GXv_char2[0] ;
         pnewccs.this.AV8PrdNum = GXv_char3[0] ;
         pnewccs.this.AV21CCStkLen = GXv_int4[0] ;
         pnewccs.this.AV9CCStkCanE = GXv_decimal5[0] ;
         pnewccs.this.AV24OldCanE = GXv_decimal6[0] ;
         pnewccs.this.AV10CCStkCanS = GXv_decimal7[0] ;
         pnewccs.this.AV25OldCanS = GXv_decimal8[0] ;
         pnewccs.this.AV23FlagEn = GXv_int1[0] ;
      }
      if ( AV23FlagEn == 0 )
      {
         Gx_msg = AV8PrdNum + " " + httpContext.getMessage( " In PNEWCCS.New CCSTKS", "") + " " + GXutil.trim( AV20CCStkDsc) ;
         System.out.println( Gx_msg );
         /*
            INSERT RECORD ON TABLE TXPCCSTKS

         */
         A719PrdNum = AV8PrdNum ;
         A3342CCStkLin = AV22CCStkULin ;
         A3343CCStkCanE = AV9CCStkCanE ;
         A3344CCStkCanS = AV10CCStkCanS ;
         A3345TipMovCc = AV11TipMovCc ;
         A3347CCStkPri = AV12CCStkPri ;
         A3348CCStkFec = AV26Fecha ;
         A3349CCStkPre = AV13CCStkPre ;
         A3350CCStkBar = AV14CCStkBar ;
         A3351CCStkReo = AV15CCStkReo ;
         A3352CCStkPar = AV16CCStkPar ;
         A3353CCStkPed = AV17CCStkPed ;
         A3354CCStkAlb = AV18CCStkAlb ;
         A3355CCStkUsu = AV19CCStkUsu ;
         A3356CCStkHor = Gx_time ;
         A3357CCStkDsc = AV20CCStkDsc ;
         A3358CCStkLen = AV21CCStkLen ;
         A3839CcoCod = (short)(0) ;
         /* Using cursor P00MV3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin), A3343CCStkCanE, A3344CCStkCanS, A3345TipMovCc, A3347CCStkPri, A3348CCStkFec, A3349CCStkPre, Integer.valueOf(A3350CCStkBar), Byte.valueOf(A3351CCStkReo), A3352CCStkPar, Integer.valueOf(A3353CCStkPed), A3354CCStkAlb, A3355CCStkUsu, A3356CCStkHor, A3357CCStkDsc, Short.valueOf(A3358CCStkLen), Short.valueOf(A3839CcoCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
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
         /* End Insert */
         Gx_msg = AV8PrdNum + " " + httpContext.getMessage( " End PNEWCCS.New CCSTKS", "") + " " + GXutil.trim( AV20CCStkDsc) ;
         System.out.println( Gx_msg );
      }
      /* Using cursor P00MV4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV8PrdNum});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A719PrdNum = P00MV4_A719PrdNum[0] ;
         A3341CCStKULin = P00MV4_A3341CCStKULin[0] ;
         n3341CCStKULin = P00MV4_n3341CCStKULin[0] ;
         Gx_msg = AV8PrdNum + " " + httpContext.getMessage( " In PNEWCCS.Act PRODUC", "") ;
         System.out.println( Gx_msg );
         A3341CCStKULin = AV22CCStkULin ;
         n3341CCStKULin = false ;
         Gx_msg = AV8PrdNum + " " + httpContext.getMessage( " End PNEWCCS.Act PRODUC", "") ;
         System.out.println( Gx_msg );
         /* Using cursor P00MV5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n3341CCStKULin), Long.valueOf(A3341CCStKULin), A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV31NCLec == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pnewccs");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnewccs.this.A396EmprCod;
      this.aP1[0] = pnewccs.this.AV8PrdNum;
      this.aP2[0] = pnewccs.this.AV9CCStkCanE;
      this.aP3[0] = pnewccs.this.AV10CCStkCanS;
      this.aP4[0] = pnewccs.this.AV11TipMovCc;
      this.aP5[0] = pnewccs.this.AV12CCStkPri;
      this.aP6[0] = pnewccs.this.AV13CCStkPre;
      this.aP7[0] = pnewccs.this.AV14CCStkBar;
      this.aP8[0] = pnewccs.this.AV15CCStkReo;
      this.aP9[0] = pnewccs.this.AV16CCStkPar;
      this.aP10[0] = pnewccs.this.AV17CCStkPed;
      this.aP11[0] = pnewccs.this.AV18CCStkAlb;
      this.aP12[0] = pnewccs.this.AV19CCStkUsu;
      this.aP13[0] = pnewccs.this.AV20CCStkDsc;
      this.aP14[0] = pnewccs.this.AV21CCStkLen;
      this.aP15[0] = pnewccs.this.AV24OldCanE;
      this.aP16[0] = pnewccs.this.AV25OldCanS;
      this.aP17[0] = pnewccs.this.AV26Fecha;
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
      P00MV2_A396EmprCod = new String[] {""} ;
      P00MV2_A719PrdNum = new String[] {""} ;
      P00MV2_A3341CCStKULin = new long[1] ;
      P00MV2_n3341CCStKULin = new boolean[] {false} ;
      A719PrdNum = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new short[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int1 = new byte[1] ;
      Gx_msg = "" ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3345TipMovCc = "" ;
      A3347CCStkPri = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A3352CCStkPar = "" ;
      A3354CCStkAlb = "" ;
      A3355CCStkUsu = "" ;
      A3356CCStkHor = "" ;
      Gx_time = "" ;
      A3357CCStkDsc = "" ;
      Gx_emsg = "" ;
      P00MV4_A396EmprCod = new String[] {""} ;
      P00MV4_A719PrdNum = new String[] {""} ;
      P00MV4_A3341CCStKULin = new long[1] ;
      P00MV4_n3341CCStKULin = new boolean[] {false} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pnewccs__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pnewccs__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pnewccs__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnewccs__default(),
         new Object[] {
             new Object[] {
            P00MV2_A396EmprCod, P00MV2_A719PrdNum, P00MV2_A3341CCStKULin, P00MV2_n3341CCStKULin
            }
            , new Object[] {
            }
            , new Object[] {
            P00MV4_A396EmprCod, P00MV4_A719PrdNum, P00MV4_A3341CCStKULin, P00MV4_n3341CCStKULin
            }
            , new Object[] {
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      /* GeneXus formulas. */
      Gx_time = GXutil.time( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV15CCStkReo ;
   private byte AV27FlagMab ;
   private byte AV31NCLec ;
   private byte AV23FlagEn ;
   private byte GXv_int1[] ;
   private byte A3351CCStkReo ;
   private short AV21CCStkLen ;
   private short GXv_int4[] ;
   private short A3358CCStkLen ;
   private short A3839CcoCod ;
   private short Gx_err ;
   private int AV14CCStkBar ;
   private int AV17CCStkPed ;
   private int GX_INS484 ;
   private int A3350CCStkBar ;
   private int A3353CCStkPed ;
   private long A3341CCStKULin ;
   private long AV22CCStkULin ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV9CCStkCanE ;
   private java.math.BigDecimal AV10CCStkCanS ;
   private java.math.BigDecimal AV13CCStkPre ;
   private java.math.BigDecimal AV24OldCanE ;
   private java.math.BigDecimal AV25OldCanS ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3349CCStkPre ;
   private String A396EmprCod ;
   private String AV8PrdNum ;
   private String AV11TipMovCc ;
   private String AV12CCStkPri ;
   private String AV16CCStkPar ;
   private String AV18CCStkAlb ;
   private String AV19CCStkUsu ;
   private String AV20CCStkDsc ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String Gx_msg ;
   private String A3345TipMovCc ;
   private String A3347CCStkPri ;
   private String A3352CCStkPar ;
   private String A3354CCStkAlb ;
   private String A3355CCStkUsu ;
   private String A3356CCStkHor ;
   private String Gx_time ;
   private String A3357CCStkDsc ;
   private String Gx_emsg ;
   private java.util.Date AV26Fecha ;
   private java.util.Date A3348CCStkFec ;
   private boolean n3341CCStKULin ;
   private java.util.Date[] aP17 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private int[] aP7 ;
   private byte[] aP8 ;
   private String[] aP9 ;
   private int[] aP10 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private String[] aP13 ;
   private short[] aP14 ;
   private java.math.BigDecimal[] aP15 ;
   private java.math.BigDecimal[] aP16 ;
   private IDataStoreProvider pr_default ;
   private String[] P00MV2_A396EmprCod ;
   private String[] P00MV2_A719PrdNum ;
   private long[] P00MV2_A3341CCStKULin ;
   private boolean[] P00MV2_n3341CCStKULin ;
   private String[] P00MV4_A396EmprCod ;
   private String[] P00MV4_A719PrdNum ;
   private long[] P00MV4_A3341CCStKULin ;
   private boolean[] P00MV4_n3341CCStKULin ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pnewccs__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class pnewccs__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class pnewccs__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class pnewccs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00MV2", "SELECT EmprCod, PrdNum, CCStKULin FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00MV3", "INSERT INTO TXPCCSTKS(EmprCod, PrdNum, CCStkLin, CCStkCanE, CCStkCanS, TipMovCc, CCStkPri, CCStkFec, CCStkPre, CCStkBar, CCStkReo, CCStkPar, CCStkPed, CCStkAlb, CCStkUsu, CCStkHor, CCStkDsc, CCStkLen, CcoCod, CCStkLot, CcStkPrv, CCStkExp, CCStkExpF, Ccstkhis, CCStkDoc, CCStkNAlb, CCStkLotFe, CCstkLotAl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
         ,new ForEachCursor("P00MV4", "SELECT EmprCod, PrdNum, CCStKULin FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00MV5", "UPDATE TXPPRODUC SET CCStKULin=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 4);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 4);
               stmt.setString(6, (String)parms[5], 2);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 1);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 10);
               stmt.setString(15, (String)parms[14], 8);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setString(17, (String)parms[16], 30);
               stmt.setShort(18, ((Number) parms[17]).shortValue());
               stmt.setShort(19, ((Number) parms[18]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               return;
      }
   }

}

