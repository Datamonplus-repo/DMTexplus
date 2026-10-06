package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class paudop0 extends GXProcedure
{
   public paudop0( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( paudop0.class ), "" );
   }

   public paudop0( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      paudop0.this.aP2 = new String[] {""};
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
      paudop0.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      paudop0.this.AV8Aud_Usur = aP1[0];
      this.aP1 = aP1;
      paudop0.this.AV10OpeNom = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = paudop0.this.A396EmprCod;
      this.aP1[0] = paudop0.this.AV8Aud_Usur;
      this.aP2[0] = paudop0.this.AV10OpeNom;
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
   private String AV8Aud_Usur ;
   private String AV10OpeNom ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
}

