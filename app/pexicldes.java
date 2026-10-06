package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexicldes extends GXProcedure
{
   public pexicldes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexicldes.class ), "" );
   }

   public pexicldes( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pexicldes.this.aP1 = new int[] {0};
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
      pexicldes.this.AV9EmprDup = aP0[0];
      this.aP0 = aP0;
      pexicldes.this.AV10CliDes = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8OK = (byte)(0) ;
      GXv_char1[0] = AV9EmprDup ;
      GXv_int2[0] = AV10CliDes ;
      GXv_int3[0] = AV8OK ;
      new app.pexicli(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3) ;
      pexicldes.this.AV9EmprDup = GXv_char1[0] ;
      pexicldes.this.AV10CliDes = GXv_int2[0] ;
      pexicldes.this.AV8OK = GXv_int3[0] ;
      if ( AV8OK == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente Destino no Existe", ""));
         AV10CliDes = 0 ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexicldes.this.AV9EmprDup;
      this.aP1[0] = pexicldes.this.AV10CliDes;
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
      GXv_int3 = new byte[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8OK ;
   private byte GXv_int3[] ;
   private short Gx_err ;
   private int AV10CliDes ;
   private int GXv_int2[] ;
   private String AV9EmprDup ;
   private String GXv_char1[] ;
   private int[] aP1 ;
   private String[] aP0 ;
}

