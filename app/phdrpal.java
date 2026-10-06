package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phdrpal extends GXProcedure
{
   public phdrpal( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phdrpal.class ), "" );
   }

   public phdrpal( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 )
   {
      phdrpal.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      phdrpal.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phdrpal.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      phdrpal.this.AV8ExisPal = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ExisPal = (byte)(0) ;
      /* Using cursor P02BS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5908PartPal = P02BS2_A5908PartPal[0] ;
         A130BarCodPar = P02BS2_A130BarCodPar[0] ;
         A132BarCodReo = P02BS2_A132BarCodReo[0] ;
         AV8ExisPal = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phdrpal.this.A396EmprCod;
      this.aP1[0] = phdrpal.this.A129BarCod;
      this.aP2[0] = phdrpal.this.AV8ExisPal;
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
      P02BS2_A396EmprCod = new String[] {""} ;
      P02BS2_A129BarCod = new int[1] ;
      P02BS2_A5908PartPal = new int[1] ;
      P02BS2_A130BarCodPar = new String[] {""} ;
      P02BS2_A132BarCodReo = new byte[1] ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phdrpal__default(),
         new Object[] {
             new Object[] {
            P02BS2_A396EmprCod, P02BS2_A129BarCod, P02BS2_A5908PartPal, P02BS2_A130BarCodPar, P02BS2_A132BarCodReo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8ExisPal ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A5908PartPal ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02BS2_A396EmprCod ;
   private int[] P02BS2_A129BarCod ;
   private int[] P02BS2_A5908PartPal ;
   private String[] P02BS2_A130BarCodPar ;
   private byte[] P02BS2_A132BarCodReo ;
}

final  class phdrpal__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02BS2", "SELECT EmprCod, BarCod, PartPal, BarCodPar, BarCodReo FROM TXPPalSal WHERE EmprCod = ? and BarCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, PartPal ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
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
      }
   }

}

