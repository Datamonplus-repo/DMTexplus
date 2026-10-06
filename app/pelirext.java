package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelirext extends GXProcedure
{
   public pelirext( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelirext.class ), "" );
   }

   public pelirext( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 )
   {
      pelirext.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 )
   {
      pelirext.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pelirext.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pelirext.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pelirext.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pelirext.this.AV8DisCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P01Z72 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8DisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISDEF");
      /* End optimized DELETE. */
      /* Using cursor P01Z73 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8DisCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A44AlbRecCod = P01Z73_A44AlbRecCod[0] ;
         A361DisCod = P01Z73_A361DisCod[0] ;
         /* Optimized DELETE. */
         /* Using cursor P01Z74 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBRDF");
         /* End optimized DELETE. */
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Optimized DELETE. */
      /* Using cursor P01Z75 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREO");
      /* End optimized DELETE. */
      /* Optimized UPDATE. */
      /* Using cursor P01Z76 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pelirext.this.A396EmprCod;
      this.aP1[0] = pelirext.this.A129BarCod;
      this.aP2[0] = pelirext.this.A132BarCodReo;
      this.aP3[0] = pelirext.this.A130BarCodPar;
      this.aP4[0] = pelirext.this.AV8DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pelirext");
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
      P01Z73_A396EmprCod = new String[] {""} ;
      P01Z73_A44AlbRecCod = new int[1] ;
      P01Z73_A361DisCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelirext__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P01Z73_A396EmprCod, P01Z73_A44AlbRecCod, P01Z73_A361DisCod
            }
            , new Object[] {
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

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV8DisCod ;
   private int A44AlbRecCod ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private int[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01Z73_A396EmprCod ;
   private int[] P01Z73_A44AlbRecCod ;
   private int[] P01Z73_A361DisCod ;
}

final  class pelirext__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P01Z72", "DELETE FROM TXPDISDEF  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISDEF")
         ,new ForEachCursor("P01Z73", "SELECT EmprCod, AlbRecCod, DisCod FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01Z74", "DELETE FROM TXPALBRDF  WHERE EmprCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBRDF")
         ,new UpdateCursor("P01Z75", "DELETE FROM TXPHISREO  WHERE EmprCod = ? and HisBarCod = ? and HisCodReo = ? and HisCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREO")
         ,new UpdateCursor("P01Z76", "UPDATE TXPBARCAD SET BarEstReo=0  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

