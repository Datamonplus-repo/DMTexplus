package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbushdr extends GXProcedure
{
   public pbushdr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbushdr.class ), "" );
   }

   public pbushdr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      pbushdr.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      pbushdr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbushdr.this.AV26PrdNum = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00Q42 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV26PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8911CC_Lin = P00Q42_A8911CC_Lin[0] ;
         A8915CC_Cant = P00Q42_A8915CC_Cant[0] ;
         n8915CC_Cant = P00Q42_n8915CC_Cant[0] ;
         A8912CC_Fech = P00Q42_A8912CC_Fech[0] ;
         n8912CC_Fech = P00Q42_n8912CC_Fech[0] ;
         A8917CC_Prec = P00Q42_A8917CC_Prec[0] ;
         n8917CC_Prec = P00Q42_n8917CC_Prec[0] ;
         A8931CC_Hdr1 = P00Q42_A8931CC_Hdr1[0] ;
         n8931CC_Hdr1 = P00Q42_n8931CC_Hdr1[0] ;
         A8932CC_Hdr2 = P00Q42_A8932CC_Hdr2[0] ;
         n8932CC_Hdr2 = P00Q42_n8932CC_Hdr2[0] ;
         A8933CC_Hdr3 = P00Q42_A8933CC_Hdr3[0] ;
         n8933CC_Hdr3 = P00Q42_n8933CC_Hdr3[0] ;
         A8927CC_NumAlb = P00Q42_A8927CC_NumAlb[0] ;
         n8927CC_NumAlb = P00Q42_n8927CC_NumAlb[0] ;
         A8913CC_Usu = P00Q42_A8913CC_Usu[0] ;
         n8913CC_Usu = P00Q42_n8913CC_Usu[0] ;
         A8916CC_Desc = P00Q42_A8916CC_Desc[0] ;
         n8916CC_Desc = P00Q42_n8916CC_Desc[0] ;
         A8908CC_AlmCod = P00Q42_A8908CC_AlmCod[0] ;
         n8908CC_AlmCod = P00Q42_n8908CC_AlmCod[0] ;
         A3345TipMovCc = P00Q42_A3345TipMovCc[0] ;
         n3345TipMovCc = P00Q42_n3345TipMovCc[0] ;
         A719PrdNum = P00Q42_A719PrdNum[0] ;
         W719PrdNum = A719PrdNum ;
         /*
            INSERT RECORD ON TABLE TXPCCSTKS

         */
         W719PrdNum = A719PrdNum ;
         W3345TipMovCc = A3345TipMovCc ;
         n3345TipMovCc = false ;
         A3342CCStkLin = A8911CC_Lin ;
         A3343CCStkCanE = DecimalUtil.doubleToDec(0) ;
         A3344CCStkCanS = A8915CC_Cant ;
         n3345TipMovCc = false ;
         A3347CCStkPri = "1" ;
         A3348CCStkFec = localUtil.ctod( localUtil.ttoc( A8912CC_Fech, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         A3349CCStkPre = A8917CC_Prec ;
         A3350CCStkBar = A8931CC_Hdr1 ;
         A3351CCStkReo = A8932CC_Hdr2 ;
         A3352CCStkPar = A8933CC_Hdr3 ;
         A3353CCStkPed = 0 ;
         A3354CCStkAlb = GXutil.str( A8927CC_NumAlb, 8, 0) ;
         A3355CCStkUsu = A8913CC_Usu ;
         A3356CCStkHor = GXutil.time( ) ;
         A3357CCStkDsc = A8916CC_Desc ;
         A3358CCStkLen = (short)(0) ;
         A3839CcoCod = A8908CC_AlmCod ;
         A5722CCStkLot = httpContext.getMessage( "DATAMON ", "") + localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         /* Using cursor P00Q43 */
         pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin), A3343CCStkCanE, A3344CCStkCanS, Boolean.valueOf(n3345TipMovCc), A3345TipMovCc, A3347CCStkPri, A3348CCStkFec, A3349CCStkPre, Integer.valueOf(A3350CCStkBar), Byte.valueOf(A3351CCStkReo), A3352CCStkPar, Integer.valueOf(A3353CCStkPed), A3354CCStkAlb, A3355CCStkUsu, A3356CCStkHor, A3357CCStkDsc, Short.valueOf(A3358CCStkLen), Short.valueOf(A3839CcoCod), A5722CCStkLot});
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
         A719PrdNum = W719PrdNum ;
         A3345TipMovCc = W3345TipMovCc ;
         n3345TipMovCc = false ;
         /* End Insert */
         AV27Ccstkulin = A8911CC_Lin ;
         Gx_msg = httpContext.getMessage( "Alta Linea ", "") + GXutil.str( A8911CC_Lin, 12, 0) ;
         System.out.println( Gx_msg );
         A719PrdNum = W719PrdNum ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      n3341CCStKULin = false ;
      /* Optimized UPDATE. */
      /* Using cursor P00Q44 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n3341CCStKULin), Long.valueOf(AV27Ccstkulin), A396EmprCod, AV26PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbushdr.this.A396EmprCod;
      this.aP1[0] = pbushdr.this.AV26PrdNum;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbushdr");
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
      P00Q42_A396EmprCod = new String[] {""} ;
      P00Q42_A8911CC_Lin = new long[1] ;
      P00Q42_A8915CC_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00Q42_n8915CC_Cant = new boolean[] {false} ;
      P00Q42_A8912CC_Fech = new java.util.Date[] {GXutil.nullDate()} ;
      P00Q42_n8912CC_Fech = new boolean[] {false} ;
      P00Q42_A8917CC_Prec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00Q42_n8917CC_Prec = new boolean[] {false} ;
      P00Q42_A8931CC_Hdr1 = new int[1] ;
      P00Q42_n8931CC_Hdr1 = new boolean[] {false} ;
      P00Q42_A8932CC_Hdr2 = new byte[1] ;
      P00Q42_n8932CC_Hdr2 = new boolean[] {false} ;
      P00Q42_A8933CC_Hdr3 = new String[] {""} ;
      P00Q42_n8933CC_Hdr3 = new boolean[] {false} ;
      P00Q42_A8927CC_NumAlb = new int[1] ;
      P00Q42_n8927CC_NumAlb = new boolean[] {false} ;
      P00Q42_A8913CC_Usu = new String[] {""} ;
      P00Q42_n8913CC_Usu = new boolean[] {false} ;
      P00Q42_A8916CC_Desc = new String[] {""} ;
      P00Q42_n8916CC_Desc = new boolean[] {false} ;
      P00Q42_A8908CC_AlmCod = new byte[1] ;
      P00Q42_n8908CC_AlmCod = new boolean[] {false} ;
      P00Q42_A3345TipMovCc = new String[] {""} ;
      P00Q42_n3345TipMovCc = new boolean[] {false} ;
      P00Q42_A719PrdNum = new String[] {""} ;
      A8915CC_Cant = DecimalUtil.ZERO ;
      A8912CC_Fech = GXutil.resetTime( GXutil.nullDate() );
      A8917CC_Prec = DecimalUtil.ZERO ;
      A8933CC_Hdr3 = "" ;
      A8913CC_Usu = "" ;
      A8916CC_Desc = "" ;
      A3345TipMovCc = "" ;
      A719PrdNum = "" ;
      W719PrdNum = "" ;
      W3345TipMovCc = "" ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3347CCStkPri = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A3352CCStkPar = "" ;
      A3354CCStkAlb = "" ;
      A3355CCStkUsu = "" ;
      A3356CCStkHor = "" ;
      A3357CCStkDsc = "" ;
      A5722CCStkLot = "" ;
      Gx_emsg = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbushdr__default(),
         new Object[] {
             new Object[] {
            P00Q42_A396EmprCod, P00Q42_A8911CC_Lin, P00Q42_A8915CC_Cant, P00Q42_n8915CC_Cant, P00Q42_A8912CC_Fech, P00Q42_n8912CC_Fech, P00Q42_A8917CC_Prec, P00Q42_n8917CC_Prec, P00Q42_A8931CC_Hdr1, P00Q42_n8931CC_Hdr1,
            P00Q42_A8932CC_Hdr2, P00Q42_n8932CC_Hdr2, P00Q42_A8933CC_Hdr3, P00Q42_n8933CC_Hdr3, P00Q42_A8927CC_NumAlb, P00Q42_n8927CC_NumAlb, P00Q42_A8913CC_Usu, P00Q42_n8913CC_Usu, P00Q42_A8916CC_Desc, P00Q42_n8916CC_Desc,
            P00Q42_A8908CC_AlmCod, P00Q42_n8908CC_AlmCod, P00Q42_A3345TipMovCc, P00Q42_n3345TipMovCc, P00Q42_A719PrdNum
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

   private byte A8932CC_Hdr2 ;
   private byte A8908CC_AlmCod ;
   private byte A3351CCStkReo ;
   private short A3358CCStkLen ;
   private short A3839CcoCod ;
   private short Gx_err ;
   private int A8931CC_Hdr1 ;
   private int A8927CC_NumAlb ;
   private int GX_INS484 ;
   private int A3350CCStkBar ;
   private int A3353CCStkPed ;
   private long A8911CC_Lin ;
   private long A3342CCStkLin ;
   private long AV27Ccstkulin ;
   private long A3341CCStKULin ;
   private java.math.BigDecimal A8915CC_Cant ;
   private java.math.BigDecimal A8917CC_Prec ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3349CCStkPre ;
   private String A396EmprCod ;
   private String AV26PrdNum ;
   private String scmdbuf ;
   private String A8933CC_Hdr3 ;
   private String A8913CC_Usu ;
   private String A8916CC_Desc ;
   private String A3345TipMovCc ;
   private String A719PrdNum ;
   private String W719PrdNum ;
   private String W3345TipMovCc ;
   private String A3347CCStkPri ;
   private String A3352CCStkPar ;
   private String A3354CCStkAlb ;
   private String A3355CCStkUsu ;
   private String A3356CCStkHor ;
   private String A3357CCStkDsc ;
   private String A5722CCStkLot ;
   private String Gx_emsg ;
   private String Gx_msg ;
   private java.util.Date A8912CC_Fech ;
   private java.util.Date A3348CCStkFec ;
   private boolean n8915CC_Cant ;
   private boolean n8912CC_Fech ;
   private boolean n8917CC_Prec ;
   private boolean n8931CC_Hdr1 ;
   private boolean n8932CC_Hdr2 ;
   private boolean n8933CC_Hdr3 ;
   private boolean n8927CC_NumAlb ;
   private boolean n8913CC_Usu ;
   private boolean n8916CC_Desc ;
   private boolean n8908CC_AlmCod ;
   private boolean n3345TipMovCc ;
   private boolean n3341CCStKULin ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P00Q42_A396EmprCod ;
   private long[] P00Q42_A8911CC_Lin ;
   private java.math.BigDecimal[] P00Q42_A8915CC_Cant ;
   private boolean[] P00Q42_n8915CC_Cant ;
   private java.util.Date[] P00Q42_A8912CC_Fech ;
   private boolean[] P00Q42_n8912CC_Fech ;
   private java.math.BigDecimal[] P00Q42_A8917CC_Prec ;
   private boolean[] P00Q42_n8917CC_Prec ;
   private int[] P00Q42_A8931CC_Hdr1 ;
   private boolean[] P00Q42_n8931CC_Hdr1 ;
   private byte[] P00Q42_A8932CC_Hdr2 ;
   private boolean[] P00Q42_n8932CC_Hdr2 ;
   private String[] P00Q42_A8933CC_Hdr3 ;
   private boolean[] P00Q42_n8933CC_Hdr3 ;
   private int[] P00Q42_A8927CC_NumAlb ;
   private boolean[] P00Q42_n8927CC_NumAlb ;
   private String[] P00Q42_A8913CC_Usu ;
   private boolean[] P00Q42_n8913CC_Usu ;
   private String[] P00Q42_A8916CC_Desc ;
   private boolean[] P00Q42_n8916CC_Desc ;
   private byte[] P00Q42_A8908CC_AlmCod ;
   private boolean[] P00Q42_n8908CC_AlmCod ;
   private String[] P00Q42_A3345TipMovCc ;
   private boolean[] P00Q42_n3345TipMovCc ;
   private String[] P00Q42_A719PrdNum ;
}

final  class pbushdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00Q42", "SELECT EmprCod, CC_Lin, CC_Cant, CC_Fech, CC_Prec, CC_Hdr1, CC_Hdr2, CC_Hdr3, CC_NumAlb, CC_Usu, CC_Desc, CC_AlmCod, TipMovCc, PrdNum FROM TXPCCALM WHERE EmprCod = ? and PrdNum = ? and CC_Lin > 999995 ORDER BY EmprCod, PrdNum, CC_Lin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00Q43", "INSERT INTO TXPCCSTKS(EmprCod, PrdNum, CCStkLin, CCStkCanE, CCStkCanS, TipMovCc, CCStkPri, CCStkFec, CCStkPre, CCStkBar, CCStkReo, CCStkPar, CCStkPed, CCStkAlb, CCStkUsu, CCStkHor, CCStkDsc, CCStkLen, CcoCod, CCStkLot, CcStkPrv, CCStkExp, CCStkExpF, Ccstkhis, CCStkDoc, CCStkNAlb, CCStkLotFe, CCstkLotAl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
         ,new UpdateCursor("P00Q44", "UPDATE TXPPRODUC SET CCStKULin=?  WHERE EmprCod = ? and PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 6);
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
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 2);
               }
               stmt.setString(7, (String)parms[7], 1);
               stmt.setDate(8, (java.util.Date)parms[8]);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[9], 5);
               stmt.setInt(10, ((Number) parms[10]).intValue());
               stmt.setByte(11, ((Number) parms[11]).byteValue());
               stmt.setString(12, (String)parms[12], 1);
               stmt.setInt(13, ((Number) parms[13]).intValue());
               stmt.setString(14, (String)parms[14], 10);
               stmt.setString(15, (String)parms[15], 8);
               stmt.setString(16, (String)parms[16], 8);
               stmt.setString(17, (String)parms[17], 30);
               stmt.setShort(18, ((Number) parms[18]).shortValue());
               stmt.setShort(19, ((Number) parms[19]).shortValue());
               stmt.setString(20, (String)parms[20], 26);
               return;
            case 2 :
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

