package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmrcomi extends GXProcedure
{
   public pmrcomi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmrcomi.class ), "" );
   }

   public pmrcomi( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      pmrcomi.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      pmrcomi.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmrcomi.this.AV8MRPriCod = aP1[0];
      this.aP1 = aP1;
      pmrcomi.this.AV9MRComCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPMRCom

      */
      A1061MRPriCod = AV8MRPriCod ;
      /* Using cursor P03Z32 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRCom");
      if ( (pr_default.getStatus(0) == 1) )
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
      if ( AV9MRComCod > 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPMRCom1

         */
         A1061MRPriCod = AV8MRPriCod ;
         A1063MRComCod = AV9MRComCod ;
         /* Using cursor P03Z33 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod), Integer.valueOf(A1063MRComCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRCom1");
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
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmrcomi.this.A396EmprCod;
      this.aP1[0] = pmrcomi.this.AV8MRPriCod;
      this.aP2[0] = pmrcomi.this.AV9MRComCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmrcomi");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmrcomi__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8MRPriCod ;
   private int AV9MRComCod ;
   private int GX_INS1345 ;
   private int A1061MRPriCod ;
   private int GX_INS1346 ;
   private int A1063MRComCod ;
   private String A396EmprCod ;
   private String Gx_emsg ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
}

final  class pmrcomi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P03Z32", "INSERT INTO TXPMRCom(EmprCod, MRPriCod) VALUES(?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMRCom")
         ,new UpdateCursor("P03Z33", "INSERT INTO TXPMRCom1(EmprCod, MRPriCod, MRComCod) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMRCom1")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

