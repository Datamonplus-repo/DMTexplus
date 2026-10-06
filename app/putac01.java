package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class putac01 extends GXProcedure
{
   public putac01( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( putac01.class ), "" );
   }

   public putac01( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      putac01.this.aP2 = new String[] {""};
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
      putac01.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      putac01.this.AV42DisCod = aP1[0];
      this.aP1 = aP1;
      putac01.this.AV50Pgmnamein = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = A396EmprCod ;
      GXv_int2[0] = AV42DisCod ;
      GXv_char3[0] = AV50Pgmnamein ;
      new app.pdeldisqui(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3) ;
      putac01.this.A396EmprCod = GXv_char1[0] ;
      putac01.this.AV42DisCod = GXv_int2[0] ;
      putac01.this.AV50Pgmnamein = GXv_char3[0] ;
      GXv_char3[0] = A396EmprCod ;
      GXv_int2[0] = AV42DisCod ;
      GXv_char1[0] = AV50Pgmnamein ;
      new app.pinsertdisqui(remoteHandle, context).execute( GXv_char3, GXv_int2, GXv_char1) ;
      putac01.this.A396EmprCod = GXv_char3[0] ;
      putac01.this.AV42DisCod = GXv_int2[0] ;
      putac01.this.AV50Pgmnamein = GXv_char1[0] ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = putac01.this.A396EmprCod;
      this.aP1[0] = putac01.this.AV42DisCod;
      this.aP2[0] = putac01.this.AV50Pgmnamein;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char3 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char1 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV42DisCod ;
   private int GXv_int2[] ;
   private String A396EmprCod ;
   private String AV50Pgmnamein ;
   private String GXv_char3[] ;
   private String GXv_char1[] ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
}

