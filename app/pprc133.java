package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc133 extends GXProcedure
{
   public pprc133( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc133.class ), "" );
   }

   public pprc133( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 )
   {
      pprc133.this.aP5 = new long[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        long[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             long[] aP5 )
   {
      pprc133.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc133.this.AV8barcod = aP1[0];
      this.aP1 = aP1;
      pprc133.this.AV9barcodreo = aP2[0];
      this.aP2 = aP2;
      pprc133.this.AV10Barcodpar = aP3[0];
      this.aP3 = aP3;
      pprc133.this.AV11Barcolnom = aP4[0];
      this.aP4 = aP4;
      pprc133.this.AV12Nhdrs = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12Nhdrs = 0 ;
      /* Using cursor P05MB2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV11Barcolnom});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A135BarColNom = P05MB2_A135BarColNom[0] ;
         A213BarSit = P05MB2_A213BarSit[0] ;
         A130BarCodPar = P05MB2_A130BarCodPar[0] ;
         A132BarCodReo = P05MB2_A132BarCodReo[0] ;
         A129BarCod = P05MB2_A129BarCod[0] ;
         if ( ( A129BarCod == AV8barcod ) && ( A132BarCodReo == AV9barcodreo ) && ( GXutil.strcmp(A130BarCodPar, AV10Barcodpar) == 0 ) )
         {
         }
         else
         {
            AV12Nhdrs = (long)(AV12Nhdrs+1) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc133.this.A396EmprCod;
      this.aP1[0] = pprc133.this.AV8barcod;
      this.aP2[0] = pprc133.this.AV9barcodreo;
      this.aP3[0] = pprc133.this.AV10Barcodpar;
      this.aP4[0] = pprc133.this.AV11Barcolnom;
      this.aP5[0] = pprc133.this.AV12Nhdrs;
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
      P05MB2_A396EmprCod = new String[] {""} ;
      P05MB2_A135BarColNom = new String[] {""} ;
      P05MB2_A213BarSit = new byte[1] ;
      P05MB2_A130BarCodPar = new String[] {""} ;
      P05MB2_A132BarCodReo = new byte[1] ;
      P05MB2_A129BarCod = new int[1] ;
      A135BarColNom = "" ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc133__default(),
         new Object[] {
             new Object[] {
            P05MB2_A396EmprCod, P05MB2_A135BarColNom, P05MB2_A213BarSit, P05MB2_A130BarCodPar, P05MB2_A132BarCodReo, P05MB2_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9barcodreo ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV8barcod ;
   private int A129BarCod ;
   private long AV12Nhdrs ;
   private String A396EmprCod ;
   private String AV10Barcodpar ;
   private String AV11Barcolnom ;
   private String scmdbuf ;
   private String A135BarColNom ;
   private String A130BarCodPar ;
   private long[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P05MB2_A396EmprCod ;
   private String[] P05MB2_A135BarColNom ;
   private byte[] P05MB2_A213BarSit ;
   private String[] P05MB2_A130BarCodPar ;
   private byte[] P05MB2_A132BarCodReo ;
   private int[] P05MB2_A129BarCod ;
}

final  class pprc133__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05MB2", "SELECT EmprCod, BarColNom, BarSit, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD WHERE (EmprCod = ? and BarColNom = ?) AND (BarSit <= 4) ORDER BY EmprCod, BarColNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
               stmt.setString(2, (String)parms[1], 13);
               return;
      }
   }

}

