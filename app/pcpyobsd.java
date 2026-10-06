package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcpyobsd extends GXProcedure
{
   public pcpyobsd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcpyobsd.class ), "" );
   }

   public pcpyobsd( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pcpyobsd.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pcpyobsd.this.AV8EmprCod = aP0[0];
      this.aP0 = aP0;
      pcpyobsd.this.AV9DisCod = aP1[0];
      this.aP1 = aP1;
      pcpyobsd.this.AV15Linha = aP2[0];
      this.aP2 = aP2;
      pcpyobsd.this.AV14DisObsTxt = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPOBSERV

      */
      A396EmprCod = AV8EmprCod ;
      A361DisCod = AV9DisCod ;
      A376DisObsLin = AV15Linha ;
      A377DisObsTxt = AV14DisObsTxt ;
      /* Using cursor P02O32 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin), A377DisObsTxt});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
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
      this.aP0[0] = pcpyobsd.this.AV8EmprCod;
      this.aP1[0] = pcpyobsd.this.AV9DisCod;
      this.aP2[0] = pcpyobsd.this.AV15Linha;
      this.aP3[0] = pcpyobsd.this.AV14DisObsTxt;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcpyobsd");
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
      A377DisObsTxt = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcpyobsd__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Linha ;
   private byte A376DisObsLin ;
   private short Gx_err ;
   private int AV9DisCod ;
   private int GX_INS40 ;
   private int A361DisCod ;
   private String AV8EmprCod ;
   private String AV14DisObsTxt ;
   private String A396EmprCod ;
   private String A377DisObsTxt ;
   private String Gx_emsg ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
}

final  class pcpyobsd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02O32", "INSERT INTO TXPOBSERV(EmprCod, DisCod, DisObsLin, DisObsTxt) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSERV")
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 60);
               return;
      }
   }

}

