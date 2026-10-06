package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvxleepz extends GXProcedure
{
   public pvxleepz( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvxleepz.class ), "" );
   }

   public pvxleepz( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pvxleepz.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pvxleepz.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pvxleepz.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pvxleepz.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pvxleepz.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pvxleepz.this.AV8VXTiMov = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02KC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A201BarPieEst = P02KC2_A201BarPieEst[0] ;
         A200BarPieCod = P02KC2_A200BarPieCod[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int3[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char5[0] = A200BarPieCod ;
         GXv_char6[0] = "" ;
         GXv_char7[0] = AV8VXTiMov ;
         new app.pvxgrain(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_char6, GXv_char7) ;
         pvxleepz.this.A396EmprCod = GXv_char1[0] ;
         pvxleepz.this.A129BarCod = GXv_int2[0] ;
         pvxleepz.this.A132BarCodReo = GXv_int3[0] ;
         pvxleepz.this.A130BarCodPar = GXv_char4[0] ;
         pvxleepz.this.A200BarPieCod = GXv_char5[0] ;
         pvxleepz.this.AV8VXTiMov = GXv_char7[0] ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pvxleepz.this.A396EmprCod;
      this.aP1[0] = pvxleepz.this.A129BarCod;
      this.aP2[0] = pvxleepz.this.A132BarCodReo;
      this.aP3[0] = pvxleepz.this.A130BarCodPar;
      this.aP4[0] = pvxleepz.this.AV8VXTiMov;
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
      P02KC2_A396EmprCod = new String[] {""} ;
      P02KC2_A129BarCod = new int[1] ;
      P02KC2_A132BarCodReo = new byte[1] ;
      P02KC2_A130BarCodPar = new String[] {""} ;
      P02KC2_A201BarPieEst = new byte[1] ;
      P02KC2_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_char7 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pvxleepz__default(),
         new Object[] {
             new Object[] {
            P02KC2_A396EmprCod, P02KC2_A129BarCod, P02KC2_A132BarCodReo, P02KC2_A130BarCodPar, P02KC2_A201BarPieEst, P02KC2_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A201BarPieEst ;
   private byte GXv_int3[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GXv_int2[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8VXTiMov ;
   private String scmdbuf ;
   private String A200BarPieCod ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02KC2_A396EmprCod ;
   private int[] P02KC2_A129BarCod ;
   private byte[] P02KC2_A132BarCodReo ;
   private String[] P02KC2_A130BarCodPar ;
   private byte[] P02KC2_A201BarPieEst ;
   private String[] P02KC2_A200BarPieCod ;
}

final  class pvxleepz__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02KC2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieEst, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
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

