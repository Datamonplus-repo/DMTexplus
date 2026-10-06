package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfasant extends GXProcedure
{
   public pfasant( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfasant.class ), "" );
   }

   public pfasant( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pfasant.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pfasant.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfasant.this.AV16Clicod = aP1[0];
      this.aP1 = aP1;
      pfasant.this.AV17Barser = aP2[0];
      this.aP2 = aP2;
      pfasant.this.Gx_msg = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = " " ;
      /* Using cursor P00KO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV17Barser});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A212BarSer = P00KO2_A212BarSer[0] ;
         A129BarCod = P00KO2_A129BarCod[0] ;
         A132BarCodReo = P00KO2_A132BarCodReo[0] ;
         A130BarCodPar = P00KO2_A130BarCodPar[0] ;
         Gx_msg = httpContext.getMessage( "Atencion. Hay Hdrs con este Articulo ¡¡¡", "") ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfasant.this.A396EmprCod;
      this.aP1[0] = pfasant.this.AV16Clicod;
      this.aP2[0] = pfasant.this.AV17Barser;
      this.aP3[0] = pfasant.this.Gx_msg;
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
      P00KO2_A396EmprCod = new String[] {""} ;
      P00KO2_A212BarSer = new String[] {""} ;
      P00KO2_A129BarCod = new int[1] ;
      P00KO2_A132BarCodReo = new byte[1] ;
      P00KO2_A130BarCodPar = new String[] {""} ;
      A212BarSer = "" ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfasant__default(),
         new Object[] {
             new Object[] {
            P00KO2_A396EmprCod, P00KO2_A212BarSer, P00KO2_A129BarCod, P00KO2_A132BarCodReo, P00KO2_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV16Clicod ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV17Barser ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A130BarCodPar ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00KO2_A396EmprCod ;
   private String[] P00KO2_A212BarSer ;
   private int[] P00KO2_A129BarCod ;
   private byte[] P00KO2_A132BarCodReo ;
   private String[] P00KO2_A130BarCodPar ;
}

final  class pfasant__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00KO2", "SELECT * FROM (SELECT EmprCod, BarSer, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and BarSer = ? ORDER BY EmprCod, BarSer) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               stmt.setString(2, (String)parms[1], 16);
               return;
      }
   }

}

