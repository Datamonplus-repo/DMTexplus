package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppartda extends GXProcedure
{
   public ppartda( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppartda.class ), "" );
   }

   public ppartda( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      ppartda.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      ppartda.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppartda.this.AV8Programa = aP1[0];
      this.aP1 = aP1;
      ppartda.this.AV9Usurcod = aP2[0];
      this.aP2 = aP2;
      ppartda.this.AV10Station = aP3[0];
      this.aP3 = aP3;
      ppartda.this.AV11Texto_i = aP4[0];
      this.aP4 = aP4;
      ppartda.this.AV12Texto_ii = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV8Programa, AV9Usurcod, AV10Station, AV11Texto_i, 99999999, (byte)(9), "@") ;
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV8Programa, AV9Usurcod, AV10Station, AV12Texto_ii, 99999999, (byte)(9), "@") ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppartda.this.A396EmprCod;
      this.aP1[0] = ppartda.this.AV8Programa;
      this.aP2[0] = ppartda.this.AV9Usurcod;
      this.aP3[0] = ppartda.this.AV10Station;
      this.aP4[0] = ppartda.this.AV11Texto_i;
      this.aP5[0] = ppartda.this.AV12Texto_ii;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8Programa ;
   private String AV9Usurcod ;
   private String AV10Station ;
   private String AV11Texto_i ;
   private String AV12Texto_ii ;
   private String[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
}

