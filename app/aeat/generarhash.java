package app.aeat ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class generarhash extends GXProcedure
{
   public generarhash( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( generarhash.class ), "" );
   }

   public generarhash( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 )
   {
      generarhash.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 )
   {
      generarhash.this.AV14InputText = aP0;
      generarhash.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12HashHex = AV15Hashing.dohash("SHA256", AV14InputText) ;
      AV10HashBase64 = httpContext.getMessage( "En investigacion", "") ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = generarhash.this.AV12HashHex;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12HashHex = "" ;
      AV15Hashing = new com.securityapi.genexuscryptography.SdtHashing(remoteHandle, context);
      AV10HashBase64 = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV14InputText ;
   private String AV12HashHex ;
   private String AV10HashBase64 ;
   private com.securityapi.genexuscryptography.SdtHashing AV15Hashing ;
   private String[] aP1 ;
}

