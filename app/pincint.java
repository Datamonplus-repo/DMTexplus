package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pincint extends GXProcedure
{
   public pincint( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pincint.class ), "" );
   }

   public pincint( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      pincint.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pincint.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pincint.this.AV8Clicod = aP1[0];
      this.aP1 = aP1;
      pincint.this.AV9Artcod = aP2[0];
      this.aP2 = aP2;
      pincint.this.AV10IntCod = aP3[0];
      this.aP3 = aP3;
      pincint.this.AV11IntDsc = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPINCINT

      */
      A252CliCod = AV8Clicod ;
      A65ArtCod = AV9Artcod ;
      A10972Int_cod = AV10IntCod ;
      A10973Int_Dsc = AV11IntDsc ;
      n10973Int_Dsc = false ;
      /* Using cursor P04BZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod), Boolean.valueOf(n10973Int_Dsc), A10973Int_Dsc});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCINT");
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
      this.aP0[0] = pincint.this.A396EmprCod;
      this.aP1[0] = pincint.this.AV8Clicod;
      this.aP2[0] = pincint.this.AV9Artcod;
      this.aP3[0] = pincint.this.AV10IntCod;
      this.aP4[0] = pincint.this.AV11IntDsc;
      Application.commitDataStores(context, remoteHandle, pr_default, "pincint");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A65ArtCod = "" ;
      A10973Int_Dsc = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pincint__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10IntCod ;
   private byte A10972Int_cod ;
   private short Gx_err ;
   private int AV8Clicod ;
   private int GX_INS1470 ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String AV9Artcod ;
   private String AV11IntDsc ;
   private String A65ArtCod ;
   private String A10973Int_Dsc ;
   private String Gx_emsg ;
   private boolean n10973Int_Dsc ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
}

final  class pincint__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P04BZ2", "INSERT INTO TXPINCINT(EmprCod, CliCod, ArtCod, Int_cod, Int_Dsc) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINCINT")
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 30);
               }
               return;
      }
   }

}

