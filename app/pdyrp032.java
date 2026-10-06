package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdyrp032 extends GXProcedure
{
   public pdyrp032( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdyrp032.class ), "" );
   }

   public pdyrp032( int remoteHandle ,
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
      pdyrp032.this.aP5 = new String[] {""};
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
      pdyrp032.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdyrp032.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pdyrp032.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pdyrp032.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pdyrp032.this.AV26usurcod = aP4[0];
      this.aP4 = aP4;
      pdyrp032.this.AV27station = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09B32 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A119BarAgrCod = P09B32_A119BarAgrCod[0] ;
         A124BarAgrReo = P09B32_A124BarAgrReo[0] ;
         A122BarAgrPar = P09B32_A122BarAgrPar[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A119BarAgrCod ;
         GXv_int3[0] = A124BarAgrReo ;
         GXv_char4[0] = A122BarAgrPar ;
         GXv_char5[0] = AV26usurcod ;
         GXv_char6[0] = AV27station ;
         new app.pdyrp031(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_char6) ;
         pdyrp032.this.A396EmprCod = GXv_char1[0] ;
         pdyrp032.this.A119BarAgrCod = GXv_int2[0] ;
         pdyrp032.this.A124BarAgrReo = GXv_int3[0] ;
         pdyrp032.this.A122BarAgrPar = GXv_char4[0] ;
         pdyrp032.this.AV26usurcod = GXv_char5[0] ;
         pdyrp032.this.AV27station = GXv_char6[0] ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdyrp032.this.A396EmprCod;
      this.aP1[0] = pdyrp032.this.A129BarCod;
      this.aP2[0] = pdyrp032.this.A132BarCodReo;
      this.aP3[0] = pdyrp032.this.A130BarCodPar;
      this.aP4[0] = pdyrp032.this.AV26usurcod;
      this.aP5[0] = pdyrp032.this.AV27station;
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
      P09B32_A396EmprCod = new String[] {""} ;
      P09B32_A129BarCod = new int[1] ;
      P09B32_A132BarCodReo = new byte[1] ;
      P09B32_A130BarCodPar = new String[] {""} ;
      P09B32_A119BarAgrCod = new int[1] ;
      P09B32_A124BarAgrReo = new byte[1] ;
      P09B32_A122BarAgrPar = new String[] {""} ;
      A122BarAgrPar = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdyrp032__default(),
         new Object[] {
             new Object[] {
            P09B32_A396EmprCod, P09B32_A129BarCod, P09B32_A132BarCodReo, P09B32_A130BarCodPar, P09B32_A119BarAgrCod, P09B32_A124BarAgrReo, P09B32_A122BarAgrPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte GXv_int3[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private int GXv_int2[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV26usurcod ;
   private String AV27station ;
   private String scmdbuf ;
   private String A122BarAgrPar ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09B32_A396EmprCod ;
   private int[] P09B32_A129BarCod ;
   private byte[] P09B32_A132BarCodReo ;
   private String[] P09B32_A130BarCodPar ;
   private int[] P09B32_A119BarAgrCod ;
   private byte[] P09B32_A124BarAgrReo ;
   private String[] P09B32_A122BarAgrPar ;
}

final  class pdyrp032__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09B32", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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

