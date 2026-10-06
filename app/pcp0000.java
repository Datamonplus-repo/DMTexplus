package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcp0000 extends GXProcedure
{
   public pcp0000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcp0000.class ), "" );
   }

   public pcp0000( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pcp0000.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pcp0000.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcp0000.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcp0000.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcp0000.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcp0000.this.AV10HisProdti = aP4[0];
      this.aP4 = aP4;
      pcp0000.this.AV11HisProdtf = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10HisProdti = " " ;
      AV11HisProdtf = " " ;
      /* Using cursor P02A82 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A461Fase = P02A82_A461Fase[0] ;
         A4440HisProDTI = P02A82_A4440HisProDTI[0] ;
         n4440HisProDTI = P02A82_n4440HisProDTI[0] ;
         A4441HisProDTF = P02A82_A4441HisProDTF[0] ;
         n4441HisProDTF = P02A82_n4441HisProDTF[0] ;
         A602MaqCod = P02A82_A602MaqCod[0] ;
         A561HisProLin = P02A82_A561HisProLin[0] ;
         A558HisProFec = P02A82_A558HisProFec[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char2[0] = A461Fase ;
         GXv_char3[0] = AV9FasActTin ;
         new app.pfastin(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3) ;
         pcp0000.this.A396EmprCod = GXv_char1[0] ;
         pcp0000.this.A461Fase = GXv_char2[0] ;
         pcp0000.this.AV9FasActTin = GXv_char3[0] ;
         if ( GXutil.strcmp(AV9FasActTin, httpContext.getMessage( "S", "")) == 0 )
         {
            if ( GXutil.strcmp(AV10HisProdti, " ") == 0 )
            {
               AV10HisProdti = localUtil.ttoc( A4440HisProDTI, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            }
            AV11HisProdtf = localUtil.ttoc( A4441HisProDTF, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV15Maqcod = A602MaqCod ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcp0000.this.A396EmprCod;
      this.aP1[0] = pcp0000.this.A129BarCod;
      this.aP2[0] = pcp0000.this.A132BarCodReo;
      this.aP3[0] = pcp0000.this.A130BarCodPar;
      this.aP4[0] = pcp0000.this.AV10HisProdti;
      this.aP5[0] = pcp0000.this.AV11HisProdtf;
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
      P02A82_A396EmprCod = new String[] {""} ;
      P02A82_A129BarCod = new int[1] ;
      P02A82_A132BarCodReo = new byte[1] ;
      P02A82_A130BarCodPar = new String[] {""} ;
      P02A82_A461Fase = new String[] {""} ;
      P02A82_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P02A82_n4440HisProDTI = new boolean[] {false} ;
      P02A82_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P02A82_n4441HisProDTF = new boolean[] {false} ;
      P02A82_A602MaqCod = new String[] {""} ;
      P02A82_A561HisProLin = new int[1] ;
      P02A82_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      A461Fase = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV9FasActTin = "" ;
      GXv_char3 = new String[1] ;
      AV15Maqcod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcp0000__default(),
         new Object[] {
             new Object[] {
            P02A82_A396EmprCod, P02A82_A129BarCod, P02A82_A132BarCodReo, P02A82_A130BarCodPar, P02A82_A461Fase, P02A82_A4440HisProDTI, P02A82_n4440HisProDTI, P02A82_A4441HisProDTF, P02A82_n4441HisProDTF, P02A82_A602MaqCod,
            P02A82_A561HisProLin, P02A82_A558HisProFec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV10HisProdti ;
   private String AV11HisProdtf ;
   private String scmdbuf ;
   private String A461Fase ;
   private String A602MaqCod ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String AV9FasActTin ;
   private String GXv_char3[] ;
   private String AV15Maqcod ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P02A82_A396EmprCod ;
   private int[] P02A82_A129BarCod ;
   private byte[] P02A82_A132BarCodReo ;
   private String[] P02A82_A130BarCodPar ;
   private String[] P02A82_A461Fase ;
   private java.util.Date[] P02A82_A4440HisProDTI ;
   private boolean[] P02A82_n4440HisProDTI ;
   private java.util.Date[] P02A82_A4441HisProDTF ;
   private boolean[] P02A82_n4441HisProDTF ;
   private String[] P02A82_A602MaqCod ;
   private int[] P02A82_A561HisProLin ;
   private java.util.Date[] P02A82_A558HisProFec ;
}

final  class pcp0000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02A82", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Fase, HisProDTI, HisProDTF, MaqCod, HisProLin, HisProFec FROM TXPLHIPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, HisProLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 6);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(10);
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
               return;
      }
   }

}

