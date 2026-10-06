package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phorala extends GXProcedure
{
   public phorala( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phorala.class ), "" );
   }

   public phorala( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            short[] aP2 ,
                            java.math.BigDecimal[] aP3 )
   {
      phorala.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             short[] aP4 )
   {
      phorala.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phorala.this.AV13DisCod = aP1[0];
      this.aP1 = aP1;
      phorala.this.AV8DisNUmPie = aP2[0];
      this.aP2 = aP2;
      phorala.this.AV9DisNumUni = aP3[0];
      this.aP3 = aP3;
      phorala.this.AV16Tiempo_t = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "F     ", "") ;
      GXv_char3[0] = AV11ContDsc ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3) ;
      phorala.this.A396EmprCod = GXv_char1[0] ;
      phorala.this.AV11ContDsc = GXv_char3[0] ;
      AV12Empresa_i = GXutil.substring( AV11ContDsc, 1, 1) ;
      AV16Tiempo_t = (short)(0) ;
      AV10Tiempo_a = (short)(0) ;
      AV15Opcion_a = (byte)(1) ;
      AV17Num_fases = (short)(0) ;
      /* Using cursor P01TZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV13DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P01TZ2_A361DisCod[0] ;
         A457FasCod = P01TZ2_A457FasCod[0] ;
         A368DisFasLin = P01TZ2_A368DisFasLin[0] ;
         A758ProCod = P01TZ2_A758ProCod[0] ;
         AV14FasCod = A457FasCod ;
         /* Execute user subroutine: 'ALAPFA' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV10Tiempo_a == 0 )
         {
            AV15Opcion_a = (byte)(0) ;
         }
         AV16Tiempo_t = (short)(AV16Tiempo_t+AV10Tiempo_a) ;
         AV17Num_fases = (short)(AV17Num_fases+1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV15Opcion_a == 1 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else
      {
         /* Execute user subroutine: 'ALAPNF' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV16Tiempo_t = AV10Tiempo_a ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'ALAPFA' Routine */
      returnInSub = false ;
      AV10Tiempo_a = (short)(0) ;
      /* Using cursor P01TZ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV14FasCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A457FasCod = P01TZ3_A457FasCod[0] ;
         A5705Hh_FKgf = P01TZ3_A5705Hh_FKgf[0] ;
         n5705Hh_FKgf = P01TZ3_n5705Hh_FKgf[0] ;
         A5704Hh_FKgi = P01TZ3_A5704Hh_FKgi[0] ;
         n5704Hh_FKgi = P01TZ3_n5704Hh_FKgi[0] ;
         A5708Hh_Ftmp = P01TZ3_A5708Hh_Ftmp[0] ;
         n5708Hh_Ftmp = P01TZ3_n5708Hh_Ftmp[0] ;
         A5707Hh_Fpzf = P01TZ3_A5707Hh_Fpzf[0] ;
         n5707Hh_Fpzf = P01TZ3_n5707Hh_Fpzf[0] ;
         A5706Hh_Fpzi = P01TZ3_A5706Hh_Fpzi[0] ;
         n5706Hh_Fpzi = P01TZ3_n5706Hh_Fpzi[0] ;
         A5703Hh_FLin = P01TZ3_A5703Hh_FLin[0] ;
         if ( GXutil.strcmp(AV12Empresa_i, httpContext.getMessage( "T", "")) == 0 )
         {
            if ( ( DecimalUtil.compareTo(AV9DisNumUni, A5704Hh_FKgi) >= 0 ) && ( DecimalUtil.compareTo(AV9DisNumUni, A5705Hh_FKgf) <= 0 ) )
            {
               AV10Tiempo_a = A5708Hh_Ftmp ;
            }
         }
         else
         {
            if ( ( AV8DisNUmPie >= A5706Hh_Fpzi ) && ( AV8DisNUmPie <= A5707Hh_Fpzf ) )
            {
               AV10Tiempo_a = A5708Hh_Ftmp ;
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'ALAPNF' Routine */
      returnInSub = false ;
      AV10Tiempo_a = (short)(0) ;
      /* Using cursor P01TZ4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(AV17Num_fases)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A5709Num_Fases = P01TZ4_A5709Num_Fases[0] ;
         A5713Hh_NFKgf = P01TZ4_A5713Hh_NFKgf[0] ;
         n5713Hh_NFKgf = P01TZ4_n5713Hh_NFKgf[0] ;
         A5712Hh_NFKgi = P01TZ4_A5712Hh_NFKgi[0] ;
         n5712Hh_NFKgi = P01TZ4_n5712Hh_NFKgi[0] ;
         A5716Hh_NFtmp = P01TZ4_A5716Hh_NFtmp[0] ;
         n5716Hh_NFtmp = P01TZ4_n5716Hh_NFtmp[0] ;
         A5715Hh_NFpzf = P01TZ4_A5715Hh_NFpzf[0] ;
         n5715Hh_NFpzf = P01TZ4_n5715Hh_NFpzf[0] ;
         A5714Hh_NFpzi = P01TZ4_A5714Hh_NFpzi[0] ;
         n5714Hh_NFpzi = P01TZ4_n5714Hh_NFpzi[0] ;
         A5711Hh_NFLin = P01TZ4_A5711Hh_NFLin[0] ;
         if ( GXutil.strcmp(AV12Empresa_i, httpContext.getMessage( "T", "")) == 0 )
         {
            if ( ( DecimalUtil.compareTo(AV9DisNumUni, A5712Hh_NFKgi) >= 0 ) && ( DecimalUtil.compareTo(AV9DisNumUni, A5713Hh_NFKgf) <= 0 ) )
            {
               AV10Tiempo_a = A5716Hh_NFtmp ;
            }
         }
         else
         {
            if ( ( AV8DisNUmPie >= A5714Hh_NFpzi ) && ( AV8DisNUmPie <= A5715Hh_NFpzf ) )
            {
               AV10Tiempo_a = A5716Hh_NFtmp ;
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = phorala.this.A396EmprCod;
      this.aP1[0] = phorala.this.AV13DisCod;
      this.aP2[0] = phorala.this.AV8DisNUmPie;
      this.aP3[0] = phorala.this.AV9DisNumUni;
      this.aP4[0] = phorala.this.AV16Tiempo_t;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV11ContDsc = "" ;
      GXv_char3 = new String[1] ;
      AV12Empresa_i = "" ;
      scmdbuf = "" ;
      P01TZ2_A396EmprCod = new String[] {""} ;
      P01TZ2_A361DisCod = new int[1] ;
      P01TZ2_A457FasCod = new String[] {""} ;
      P01TZ2_A368DisFasLin = new short[1] ;
      P01TZ2_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      AV14FasCod = "" ;
      P01TZ3_A396EmprCod = new String[] {""} ;
      P01TZ3_A457FasCod = new String[] {""} ;
      P01TZ3_A5705Hh_FKgf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01TZ3_n5705Hh_FKgf = new boolean[] {false} ;
      P01TZ3_A5704Hh_FKgi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01TZ3_n5704Hh_FKgi = new boolean[] {false} ;
      P01TZ3_A5708Hh_Ftmp = new short[1] ;
      P01TZ3_n5708Hh_Ftmp = new boolean[] {false} ;
      P01TZ3_A5707Hh_Fpzf = new int[1] ;
      P01TZ3_n5707Hh_Fpzf = new boolean[] {false} ;
      P01TZ3_A5706Hh_Fpzi = new int[1] ;
      P01TZ3_n5706Hh_Fpzi = new boolean[] {false} ;
      P01TZ3_A5703Hh_FLin = new short[1] ;
      A5705Hh_FKgf = DecimalUtil.ZERO ;
      A5704Hh_FKgi = DecimalUtil.ZERO ;
      P01TZ4_A396EmprCod = new String[] {""} ;
      P01TZ4_A5709Num_Fases = new short[1] ;
      P01TZ4_A5713Hh_NFKgf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01TZ4_n5713Hh_NFKgf = new boolean[] {false} ;
      P01TZ4_A5712Hh_NFKgi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01TZ4_n5712Hh_NFKgi = new boolean[] {false} ;
      P01TZ4_A5716Hh_NFtmp = new short[1] ;
      P01TZ4_n5716Hh_NFtmp = new boolean[] {false} ;
      P01TZ4_A5715Hh_NFpzf = new int[1] ;
      P01TZ4_n5715Hh_NFpzf = new boolean[] {false} ;
      P01TZ4_A5714Hh_NFpzi = new int[1] ;
      P01TZ4_n5714Hh_NFpzi = new boolean[] {false} ;
      P01TZ4_A5711Hh_NFLin = new short[1] ;
      A5713Hh_NFKgf = DecimalUtil.ZERO ;
      A5712Hh_NFKgi = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phorala__default(),
         new Object[] {
             new Object[] {
            P01TZ2_A396EmprCod, P01TZ2_A361DisCod, P01TZ2_A457FasCod, P01TZ2_A368DisFasLin, P01TZ2_A758ProCod
            }
            , new Object[] {
            P01TZ3_A396EmprCod, P01TZ3_A457FasCod, P01TZ3_A5705Hh_FKgf, P01TZ3_n5705Hh_FKgf, P01TZ3_A5704Hh_FKgi, P01TZ3_n5704Hh_FKgi, P01TZ3_A5708Hh_Ftmp, P01TZ3_n5708Hh_Ftmp, P01TZ3_A5707Hh_Fpzf, P01TZ3_n5707Hh_Fpzf,
            P01TZ3_A5706Hh_Fpzi, P01TZ3_n5706Hh_Fpzi, P01TZ3_A5703Hh_FLin
            }
            , new Object[] {
            P01TZ4_A396EmprCod, P01TZ4_A5709Num_Fases, P01TZ4_A5713Hh_NFKgf, P01TZ4_n5713Hh_NFKgf, P01TZ4_A5712Hh_NFKgi, P01TZ4_n5712Hh_NFKgi, P01TZ4_A5716Hh_NFtmp, P01TZ4_n5716Hh_NFtmp, P01TZ4_A5715Hh_NFpzf, P01TZ4_n5715Hh_NFpzf,
            P01TZ4_A5714Hh_NFpzi, P01TZ4_n5714Hh_NFpzi, P01TZ4_A5711Hh_NFLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Opcion_a ;
   private short AV8DisNUmPie ;
   private short AV16Tiempo_t ;
   private short AV10Tiempo_a ;
   private short AV17Num_fases ;
   private short A368DisFasLin ;
   private short A5708Hh_Ftmp ;
   private short A5703Hh_FLin ;
   private short A5709Num_Fases ;
   private short A5716Hh_NFtmp ;
   private short A5711Hh_NFLin ;
   private short Gx_err ;
   private int AV13DisCod ;
   private int A361DisCod ;
   private int A5707Hh_Fpzf ;
   private int A5706Hh_Fpzi ;
   private int A5715Hh_NFpzf ;
   private int A5714Hh_NFpzi ;
   private java.math.BigDecimal AV9DisNumUni ;
   private java.math.BigDecimal A5705Hh_FKgf ;
   private java.math.BigDecimal A5704Hh_FKgi ;
   private java.math.BigDecimal A5713Hh_NFKgf ;
   private java.math.BigDecimal A5712Hh_NFKgi ;
   private String A396EmprCod ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String AV11ContDsc ;
   private String GXv_char3[] ;
   private String AV12Empresa_i ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String AV14FasCod ;
   private boolean returnInSub ;
   private boolean n5705Hh_FKgf ;
   private boolean n5704Hh_FKgi ;
   private boolean n5708Hh_Ftmp ;
   private boolean n5707Hh_Fpzf ;
   private boolean n5706Hh_Fpzi ;
   private boolean n5713Hh_NFKgf ;
   private boolean n5712Hh_NFKgi ;
   private boolean n5716Hh_NFtmp ;
   private boolean n5715Hh_NFpzf ;
   private boolean n5714Hh_NFpzi ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01TZ2_A396EmprCod ;
   private int[] P01TZ2_A361DisCod ;
   private String[] P01TZ2_A457FasCod ;
   private short[] P01TZ2_A368DisFasLin ;
   private String[] P01TZ2_A758ProCod ;
   private String[] P01TZ3_A396EmprCod ;
   private String[] P01TZ3_A457FasCod ;
   private java.math.BigDecimal[] P01TZ3_A5705Hh_FKgf ;
   private boolean[] P01TZ3_n5705Hh_FKgf ;
   private java.math.BigDecimal[] P01TZ3_A5704Hh_FKgi ;
   private boolean[] P01TZ3_n5704Hh_FKgi ;
   private short[] P01TZ3_A5708Hh_Ftmp ;
   private boolean[] P01TZ3_n5708Hh_Ftmp ;
   private int[] P01TZ3_A5707Hh_Fpzf ;
   private boolean[] P01TZ3_n5707Hh_Fpzf ;
   private int[] P01TZ3_A5706Hh_Fpzi ;
   private boolean[] P01TZ3_n5706Hh_Fpzi ;
   private short[] P01TZ3_A5703Hh_FLin ;
   private String[] P01TZ4_A396EmprCod ;
   private short[] P01TZ4_A5709Num_Fases ;
   private java.math.BigDecimal[] P01TZ4_A5713Hh_NFKgf ;
   private boolean[] P01TZ4_n5713Hh_NFKgf ;
   private java.math.BigDecimal[] P01TZ4_A5712Hh_NFKgi ;
   private boolean[] P01TZ4_n5712Hh_NFKgi ;
   private short[] P01TZ4_A5716Hh_NFtmp ;
   private boolean[] P01TZ4_n5716Hh_NFtmp ;
   private int[] P01TZ4_A5715Hh_NFpzf ;
   private boolean[] P01TZ4_n5715Hh_NFpzf ;
   private int[] P01TZ4_A5714Hh_NFpzi ;
   private boolean[] P01TZ4_n5714Hh_NFpzi ;
   private short[] P01TZ4_A5711Hh_NFLin ;
}

final  class phorala__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01TZ2", "SELECT EmprCod, DisCod, FasCod, DisFasLin, ProCod FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01TZ3", "SELECT EmprCod, FasCod, Hh_FKgf, Hh_FKgi, Hh_Ftmp, Hh_Fpzf, Hh_Fpzi, Hh_FLin FROM TXPALAPFA WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod, Hh_FLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01TZ4", "SELECT EmprCod, Num_Fases, Hh_NFKgf, Hh_NFKgi, Hh_NFtmp, Hh_NFpzf, Hh_NFpzi, Hh_NFLin FROM TXPALAPn1 WHERE EmprCod = ? and Num_Fases = ? ORDER BY EmprCod, Num_Fases, Hh_NFLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

