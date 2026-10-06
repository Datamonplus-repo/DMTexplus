package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class txphojamaloadredundancy extends GXProcedure
{
   public txphojamaloadredundancy( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txphojamaloadredundancy.class ), "" );
   }

   public txphojamaloadredundancy( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Loading redundancy in table TXPHojaMa ...", "") );
      /* Using cursor TXPHOJAMAL2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3079CodOpe = TXPHOJAMAL2_A3079CodOpe[0] ;
         n3079CodOpe = TXPHOJAMAL2_n3079CodOpe[0] ;
         A3078HojMaqCod = TXPHOJAMAL2_A3078HojMaqCod[0] ;
         A3090HojMaqTip = TXPHOJAMAL2_A3090HojMaqTip[0] ;
         /* Using cursor TXPHOJAMAL3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n3079CodOpe), Integer.valueOf(A3079CodOpe)});
         A3081CodOpeTip = TXPHOJAMAL3_A3081CodOpeTip[0] ;
         n3081CodOpeTip = TXPHOJAMAL3_n3081CodOpeTip[0] ;
         A3090HojMaqTip = A3081CodOpeTip ;
         /* Using cursor TXPHOJAMAL4 */
         pr_default.execute(2, new Object[] {Byte.valueOf(A3090HojMaqTip), Integer.valueOf(A3078HojMaqCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHojaMa");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      pr_default.close(1);
      System.out.println( "" );
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "txphojamaloadredundancy");
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
      TXPHOJAMAL2_A3079CodOpe = new int[1] ;
      TXPHOJAMAL2_n3079CodOpe = new boolean[] {false} ;
      TXPHOJAMAL2_A3078HojMaqCod = new int[1] ;
      TXPHOJAMAL2_A3090HojMaqTip = new byte[1] ;
      TXPHOJAMAL3_A3081CodOpeTip = new byte[1] ;
      TXPHOJAMAL3_n3081CodOpeTip = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txphojamaloadredundancy__default(),
         new Object[] {
             new Object[] {
            TXPHOJAMAL2_A3079CodOpe, TXPHOJAMAL2_n3079CodOpe, TXPHOJAMAL2_A3078HojMaqCod, TXPHOJAMAL2_A3090HojMaqTip
            }
            , new Object[] {
            TXPHOJAMAL3_A3081CodOpeTip, TXPHOJAMAL3_n3081CodOpeTip
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A3090HojMaqTip ;
   private byte A3081CodOpeTip ;
   private short Gx_err ;
   private int A3079CodOpe ;
   private int A3078HojMaqCod ;
   private String scmdbuf ;
   private boolean n3079CodOpe ;
   private boolean n3081CodOpeTip ;
   private IDataStoreProvider pr_default ;
   private int[] TXPHOJAMAL2_A3079CodOpe ;
   private boolean[] TXPHOJAMAL2_n3079CodOpe ;
   private int[] TXPHOJAMAL2_A3078HojMaqCod ;
   private byte[] TXPHOJAMAL2_A3090HojMaqTip ;
   private byte[] TXPHOJAMAL3_A3081CodOpeTip ;
   private boolean[] TXPHOJAMAL3_n3081CodOpeTip ;
}

final  class txphojamaloadredundancy__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("TXPHOJAMAL2", "SELECT CodOpe, HojMaqCod, HojMaqTip FROM TXPHojaMa ORDER BY HojMaqCod  FOR UPDATE OF HojMaqTip NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("TXPHOJAMAL3", "SELECT CodOpeTip FROM TXPOPERA WHERE CodOpe = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("TXPHOJAMAL4", "UPDATE TXPHojaMa SET HojMaqTip=?  WHERE HojMaqCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHojaMa")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

