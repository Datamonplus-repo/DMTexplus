package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfirmad extends GXProcedure
{
   public pfirmad( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfirmad.class ), "" );
   }

   public pfirmad( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pfirmad.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pfirmad.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfirmad.this.AV8FacCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = A396EmprCod ;
      GXv_int2[0] = AV8FacCod ;
      new app.ptfirma(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
      pfirmad.this.A396EmprCod = GXv_char1[0] ;
      pfirmad.this.AV8FacCod = GXv_int2[0] ;
      GXv_char1[0] = A396EmprCod ;
      GXv_int2[0] = AV8FacCod ;
      new app.pfirmactrl(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
      pfirmad.this.A396EmprCod = GXv_char1[0] ;
      pfirmad.this.AV8FacCod = GXv_int2[0] ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfirmad.this.A396EmprCod;
      this.aP1[0] = pfirmad.this.AV8FacCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8FacCod ;
   private int GXv_int2[] ;
   private String A396EmprCod ;
   private String GXv_char1[] ;
   private int[] aP1 ;
   private String[] aP0 ;
}

