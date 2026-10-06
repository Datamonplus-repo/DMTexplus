package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class paltalot extends GXProcedure
{
   public paltalot( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( paltalot.class ), "" );
   }

   public paltalot( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      paltalot.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      paltalot.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      paltalot.this.AV8Lot_cod = aP1[0];
      this.aP1 = aP1;
      paltalot.this.AV9Md_cod = aP2[0];
      this.aP2 = aP2;
      paltalot.this.AV10Telar_cod = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPLOTEEM

      */
      A609Lot_cod = AV8Lot_cod ;
      A406Md_cod = AV9Md_cod ;
      A10242Telar_cod = AV10Telar_cod ;
      /* Using cursor P03XB2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A609Lot_cod, A406Md_cod, A10242Telar_cod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLOTEEM");
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
      this.aP0[0] = paltalot.this.A396EmprCod;
      this.aP1[0] = paltalot.this.AV8Lot_cod;
      this.aP2[0] = paltalot.this.AV9Md_cod;
      this.aP3[0] = paltalot.this.AV10Telar_cod;
      Application.commitDataStores(context, remoteHandle, pr_default, "paltalot");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A609Lot_cod = "" ;
      A406Md_cod = "" ;
      A10242Telar_cod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.paltalot__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GX_INS1387 ;
   private String A396EmprCod ;
   private String AV8Lot_cod ;
   private String AV9Md_cod ;
   private String AV10Telar_cod ;
   private String A609Lot_cod ;
   private String A406Md_cod ;
   private String A10242Telar_cod ;
   private String Gx_emsg ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
}

final  class paltalot__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P03XB2", "INSERT INTO TXPLOTEEM(EmprCod, Lot_cod, Md_cod, Telar_cod) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLOTEEM")
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
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 13);
               stmt.setString(4, (String)parms[3], 20);
               return;
      }
   }

}

