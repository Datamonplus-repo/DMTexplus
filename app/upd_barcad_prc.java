package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class upd_barcad_prc extends GXProcedure
{
   public upd_barcad_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( upd_barcad_prc.class ), "" );
   }

   public upd_barcad_prc( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0AAS2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P0AAS2_A130BarCodPar[0] ;
         A132BarCodReo = P0AAS2_A132BarCodReo[0] ;
         A129BarCod = P0AAS2_A129BarCod[0] ;
         A396EmprCod = P0AAS2_A396EmprCod[0] ;
         A9775BarItem1 = P0AAS2_A9775BarItem1[0] ;
         A9775BarItem1 = httpContext.getMessage( "Test", "") ;
         /* Using cursor P0AAS3 */
         pr_default.execute(1, new Object[] {A9775BarItem1, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "upd_barcad_prc");
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
      P0AAS2_A130BarCodPar = new String[] {""} ;
      P0AAS2_A132BarCodReo = new byte[1] ;
      P0AAS2_A129BarCod = new int[1] ;
      P0AAS2_A396EmprCod = new String[] {""} ;
      P0AAS2_A9775BarItem1 = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A9775BarItem1 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.upd_barcad_prc__default(),
         new Object[] {
             new Object[] {
            P0AAS2_A130BarCodPar, P0AAS2_A132BarCodReo, P0AAS2_A129BarCod, P0AAS2_A396EmprCod, P0AAS2_A9775BarItem1
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A9775BarItem1 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AAS2_A130BarCodPar ;
   private byte[] P0AAS2_A132BarCodReo ;
   private int[] P0AAS2_A129BarCod ;
   private String[] P0AAS2_A396EmprCod ;
   private String[] P0AAS2_A9775BarItem1 ;
}

final  class upd_barcad_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AAS2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarItem1 FROM TXPBARCAD WHERE EmprCod = '001' and BarCod = 690585 and BarCodReo = 0 and BarCodPar = '' ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AAS3", "UPDATE TXPBARCAD SET BarItem1=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

