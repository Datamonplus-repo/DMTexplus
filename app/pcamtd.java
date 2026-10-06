package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcamtd extends GXProcedure
{
   public pcamtd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcamtd.class ), "" );
   }

   public pcamtd( int remoteHandle ,
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
      pcamtd.this.aP4 = new String[] {""};
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
      pcamtd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcamtd.this.AV8Barcod = aP1[0];
      this.aP1 = aP1;
      pcamtd.this.AV9Barcodreo = aP2[0];
      this.aP2 = aP2;
      pcamtd.this.AV10Barcodpar = aP3[0];
      this.aP3 = aP3;
      pcamtd.this.AV11Bartipdis = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02QL2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Barcod), Byte.valueOf(AV9Barcodreo), AV10Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P02QL2_A130BarCodPar[0] ;
         A132BarCodReo = P02QL2_A132BarCodReo[0] ;
         A129BarCod = P02QL2_A129BarCod[0] ;
         A122BarAgrPar = P02QL2_A122BarAgrPar[0] ;
         A124BarAgrReo = P02QL2_A124BarAgrReo[0] ;
         A119BarAgrCod = P02QL2_A119BarAgrCod[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A119BarAgrCod ;
         GXv_int3[0] = A124BarAgrReo ;
         GXv_char4[0] = A122BarAgrPar ;
         GXv_char5[0] = AV11Bartipdis ;
         new app.pcamtda(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5) ;
         pcamtd.this.A396EmprCod = GXv_char1[0] ;
         pcamtd.this.A119BarAgrCod = GXv_int2[0] ;
         pcamtd.this.A124BarAgrReo = GXv_int3[0] ;
         pcamtd.this.A122BarAgrPar = GXv_char4[0] ;
         pcamtd.this.AV11Bartipdis = GXv_char5[0] ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcamtd.this.A396EmprCod;
      this.aP1[0] = pcamtd.this.AV8Barcod;
      this.aP2[0] = pcamtd.this.AV9Barcodreo;
      this.aP3[0] = pcamtd.this.AV10Barcodpar;
      this.aP4[0] = pcamtd.this.AV11Bartipdis;
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
      P02QL2_A396EmprCod = new String[] {""} ;
      P02QL2_A130BarCodPar = new String[] {""} ;
      P02QL2_A132BarCodReo = new byte[1] ;
      P02QL2_A129BarCod = new int[1] ;
      P02QL2_A122BarAgrPar = new String[] {""} ;
      P02QL2_A124BarAgrReo = new byte[1] ;
      P02QL2_A119BarAgrCod = new int[1] ;
      A130BarCodPar = "" ;
      A122BarAgrPar = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcamtd__default(),
         new Object[] {
             new Object[] {
            P02QL2_A396EmprCod, P02QL2_A130BarCodPar, P02QL2_A132BarCodReo, P02QL2_A129BarCod, P02QL2_A122BarAgrPar, P02QL2_A124BarAgrReo, P02QL2_A119BarAgrCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9Barcodreo ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte GXv_int3[] ;
   private short Gx_err ;
   private int AV8Barcod ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private int GXv_int2[] ;
   private String A396EmprCod ;
   private String AV10Barcodpar ;
   private String AV11Bartipdis ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A122BarAgrPar ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02QL2_A396EmprCod ;
   private String[] P02QL2_A130BarCodPar ;
   private byte[] P02QL2_A132BarCodReo ;
   private int[] P02QL2_A129BarCod ;
   private String[] P02QL2_A122BarAgrPar ;
   private byte[] P02QL2_A124BarAgrReo ;
   private int[] P02QL2_A119BarAgrCod ;
}

final  class pcamtd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02QL2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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

