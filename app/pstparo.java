package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pstparo extends GXProcedure
{
   public pstparo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pstparo.class ), "" );
   }

   public pstparo( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     int[] aP1 ,
                                     byte[] aP2 ,
                                     String[] aP3 ,
                                     short[] aP4 ,
                                     String[] aP5 ,
                                     short[] aP6 ,
                                     String[] aP7 )
   {
      pstparo.this.aP8 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 ,
                        String[] aP7 ,
                        java.util.Date[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 ,
                             java.util.Date[] aP8 )
   {
      pstparo.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pstparo.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pstparo.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pstparo.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pstparo.this.A194BarOrdLin = aP4[0];
      this.aP4 = aP4;
      pstparo.this.A602MaqCod = aP5[0];
      this.aP5 = aP5;
      pstparo.this.AV9ParCod = aP6[0];
      this.aP6 = aP6;
      pstparo.this.AV8EstFase = aP7[0];
      this.aP7 = aP7;
      pstparo.this.AV11HisProdti = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8EstFase = GXutil.space( (short)(1)) ;
      GXt_int1 = AV10IdiomaPt ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, "100001", GXv_int2) ;
      pstparo.this.GXt_int1 = GXv_int2[0] ;
      AV10IdiomaPt = GXt_int1 ;
      AV11HisProdti = GXutil.resetTime( GXutil.nullDate() );
      /* Using cursor P05M72 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin), Short.valueOf(AV9ParCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A656ParCod = P05M72_A656ParCod[0] ;
         n656ParCod = P05M72_n656ParCod[0] ;
         A556HisProEst = P05M72_A556HisProEst[0] ;
         A4440HisProDTI = P05M72_A4440HisProDTI[0] ;
         n4440HisProDTI = P05M72_n4440HisProDTI[0] ;
         A557HisProF = P05M72_A557HisProF[0] ;
         A561HisProLin = P05M72_A561HisProLin[0] ;
         A558HisProFec = P05M72_A558HisProFec[0] ;
         if ( A556HisProEst == 0 )
         {
            AV8EstFase = httpContext.getMessage( "INICIADO", "") ;
            AV11HisProdti = A4440HisProDTI ;
         }
         if ( ( A556HisProEst == 1 ) || ( GXutil.strcmp(A557HisProF, httpContext.getMessage( "S", "")) == 0 ) )
         {
            if ( AV10IdiomaPt == 1 )
            {
               AV8EstFase = httpContext.getMessage( "FECHADO", "") ;
            }
            else
            {
               AV8EstFase = httpContext.getMessage( "CERRADO", "") ;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pstparo.this.A396EmprCod;
      this.aP1[0] = pstparo.this.A129BarCod;
      this.aP2[0] = pstparo.this.A132BarCodReo;
      this.aP3[0] = pstparo.this.A130BarCodPar;
      this.aP4[0] = pstparo.this.A194BarOrdLin;
      this.aP5[0] = pstparo.this.A602MaqCod;
      this.aP6[0] = pstparo.this.AV9ParCod;
      this.aP7[0] = pstparo.this.AV8EstFase;
      this.aP8[0] = pstparo.this.AV11HisProdti;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P05M72_A396EmprCod = new String[] {""} ;
      P05M72_A602MaqCod = new String[] {""} ;
      P05M72_A129BarCod = new int[1] ;
      P05M72_A132BarCodReo = new byte[1] ;
      P05M72_A130BarCodPar = new String[] {""} ;
      P05M72_A194BarOrdLin = new short[1] ;
      P05M72_A656ParCod = new short[1] ;
      P05M72_n656ParCod = new boolean[] {false} ;
      P05M72_A556HisProEst = new byte[1] ;
      P05M72_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P05M72_n4440HisProDTI = new boolean[] {false} ;
      P05M72_A557HisProF = new String[] {""} ;
      P05M72_A561HisProLin = new int[1] ;
      P05M72_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A557HisProF = "" ;
      A558HisProFec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pstparo__default(),
         new Object[] {
             new Object[] {
            P05M72_A396EmprCod, P05M72_A602MaqCod, P05M72_A129BarCod, P05M72_A132BarCodReo, P05M72_A130BarCodPar, P05M72_A194BarOrdLin, P05M72_A656ParCod, P05M72_n656ParCod, P05M72_A556HisProEst, P05M72_A4440HisProDTI,
            P05M72_n4440HisProDTI, P05M72_A557HisProF, P05M72_A561HisProLin, P05M72_A558HisProFec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV10IdiomaPt ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A556HisProEst ;
   private short A194BarOrdLin ;
   private short AV9ParCod ;
   private short A656ParCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A602MaqCod ;
   private String AV8EstFase ;
   private String scmdbuf ;
   private String A557HisProF ;
   private java.util.Date AV11HisProdti ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A558HisProFec ;
   private boolean n656ParCod ;
   private boolean n4440HisProDTI ;
   private java.util.Date[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private short[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P05M72_A396EmprCod ;
   private String[] P05M72_A602MaqCod ;
   private int[] P05M72_A129BarCod ;
   private byte[] P05M72_A132BarCodReo ;
   private String[] P05M72_A130BarCodPar ;
   private short[] P05M72_A194BarOrdLin ;
   private short[] P05M72_A656ParCod ;
   private boolean[] P05M72_n656ParCod ;
   private byte[] P05M72_A556HisProEst ;
   private java.util.Date[] P05M72_A4440HisProDTI ;
   private boolean[] P05M72_n4440HisProDTI ;
   private String[] P05M72_A557HisProF ;
   private int[] P05M72_A561HisProLin ;
   private java.util.Date[] P05M72_A558HisProFec ;
}

final  class pstparo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05M72", "SELECT EmprCod, MaqCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, ParCod, HisProEst, HisProDTI, HisProF, HisProLin, HisProFec FROM TXPLHIPRO WHERE (EmprCod = ? and MaqCod = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) AND (BarOrdLin = ?) AND (ParCod = ?) ORDER BY EmprCod, MaqCod, HisProFec, HisProLin, BarCod, BarCodReo, BarCodPar, ParCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(12);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

