package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palbrelobs extends GXProcedure
{
   public palbrelobs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palbrelobs.class ), "" );
   }

   public palbrelobs( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      palbrelobs.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      palbrelobs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palbrelobs.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      palbrelobs.this.AV8Obs = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Lines = GXutil.gxmlines( AV8Obs, (short)(60)) ;
      AV10i = 0 ;
      /* Using cursor P01AK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1301AlbRUlin = P01AK2_A1301AlbRUlin[0] ;
         while ( AV10i <= AV9Lines )
         {
            AV10i = (long)(AV10i+1) ;
            A1301AlbRUlin = (byte)(A1301AlbRUlin+1) ;
            /*
               INSERT RECORD ON TABLE TXPALBROB

            */
            A1299AlbRLin = A1301AlbRUlin ;
            A1300AlbRObs = GXutil.gxgetmli( AV8Obs, (short)(AV10i), (short)(60)) ;
            /* Using cursor P01AK3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), Byte.valueOf(A1299AlbRLin), A1300AlbRObs});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBROB");
            if ( (pr_default.getStatus(1) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
         }
         /* Using cursor P01AK4 */
         pr_default.execute(2, new Object[] {Byte.valueOf(A1301AlbRUlin), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palbrelobs.this.A396EmprCod;
      this.aP1[0] = palbrelobs.this.A44AlbRecCod;
      this.aP2[0] = palbrelobs.this.AV8Obs;
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
      P01AK2_A396EmprCod = new String[] {""} ;
      P01AK2_A44AlbRecCod = new int[1] ;
      P01AK2_A1301AlbRUlin = new byte[1] ;
      A1300AlbRObs = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palbrelobs__default(),
         new Object[] {
             new Object[] {
            P01AK2_A396EmprCod, P01AK2_A44AlbRecCod, P01AK2_A1301AlbRUlin
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

   private byte A1301AlbRUlin ;
   private byte A1299AlbRLin ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private int GX_INS191 ;
   private long AV9Lines ;
   private long AV10i ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A1300AlbRObs ;
   private String Gx_emsg ;
   private String AV8Obs ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01AK2_A396EmprCod ;
   private int[] P01AK2_A44AlbRecCod ;
   private byte[] P01AK2_A1301AlbRUlin ;
}

final  class palbrelobs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01AK2", "SELECT EmprCod, AlbRecCod, AlbRUlin FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01AK3", "INSERT INTO TXPALBROB(EmprCod, AlbRecCod, AlbRLin, AlbRObs) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBROB")
         ,new UpdateCursor("P01AK4", "UPDATE TXPALBREC SET AlbRUlin=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 60);
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

