package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvxcole extends GXProcedure
{
   public pvxcole( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvxcole.class ), "" );
   }

   public pvxcole( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( int[] aP0 ,
                             String[] aP1 )
   {
      pvxcole.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( int[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( int[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pvxcole.this.AV8ForColNum = aP0[0];
      this.aP0 = aP0;
      pvxcole.this.AV9ForColNom = aP1[0];
      this.aP1 = aP1;
      pvxcole.this.AV10ForNomCli2 = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE VTXCOLOREM

      */
      A6278VxColEC = AV8ForColNum ;
      A6279VxColED = AV9ForColNom ;
      n6279VxColED = false ;
      if ( ! (GXutil.strcmp("", AV10ForNomCli2)==0) )
      {
         A7097VxColEDL = AV10ForNomCli2 ;
         n7097VxColEDL = false ;
      }
      else
      {
         A7097VxColEDL = AV9ForColNom ;
         n7097VxColEDL = false ;
      }
      /* Using cursor P02DE2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(A6278VxColEC), Boolean.valueOf(n6279VxColED), A6279VxColED, Boolean.valueOf(n7097VxColEDL), A7097VxColEDL});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXCOLOREM");
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
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pvxcole.this.AV8ForColNum;
      this.aP1[0] = pvxcole.this.AV9ForColNom;
      this.aP2[0] = pvxcole.this.AV10ForNomCli2;
      Application.commitDataStores(context, remoteHandle, pr_default, "pvxcole");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A6279VxColED = "" ;
      A7097VxColEDL = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pvxcole__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8ForColNum ;
   private int GX_INS913 ;
   private int A6278VxColEC ;
   private String AV9ForColNom ;
   private String AV10ForNomCli2 ;
   private String A6279VxColED ;
   private String A7097VxColEDL ;
   private String Gx_emsg ;
   private boolean n6279VxColED ;
   private boolean n7097VxColEDL ;
   private String[] aP2 ;
   private int[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
}

final  class pvxcole__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02DE2", "INSERT INTO VTXCOLOREM(ColEcod, ColEdsc, ColEDscL) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "VTXCOLOREM")
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 13);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 20);
               }
               return;
      }
   }

}

