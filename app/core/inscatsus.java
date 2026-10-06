package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class inscatsus extends GXProcedure
{
   public inscatsus( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( inscatsus.class ), "" );
   }

   public inscatsus( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      inscatsus.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      inscatsus.this.AV8Emprcod = aP0[0];
      this.aP0 = aP0;
      inscatsus.this.AV9Prdnum = aP1[0];
      this.aP1 = aP1;
      inscatsus.this.AV10Thelist = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPCATSUS

      */
      A396EmprCod = AV8Emprcod ;
      A719PrdNum = AV9Prdnum ;
      A13586TheList = AV10Thelist ;
      /* Using cursor P096V2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, A13586TheList});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCATSUS");
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
      this.aP0[0] = inscatsus.this.AV8Emprcod;
      this.aP1[0] = inscatsus.this.AV9Prdnum;
      this.aP2[0] = inscatsus.this.AV10Thelist;
      Application.commitDataStores(context, remoteHandle, pr_default, "core.inscatsus");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A13586TheList = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.inscatsus__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GX_INS1858 ;
   private String AV8Emprcod ;
   private String AV9Prdnum ;
   private String AV10Thelist ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A13586TheList ;
   private String Gx_emsg ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
}

final  class inscatsus__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P096V2", "INSERT INTO TXPCATSUS(EmprCod, PrdNum, TheList) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCATSUS")
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               return;
      }
   }

}

