package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcargop extends GXProcedure
{
   public pcargop( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcargop.class ), "" );
   }

   public pcargop( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pcargop.this.aP2 = new String[] {""};
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
      pcargop.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcargop.this.AV8Disartcod = aP1[0];
      this.aP1 = aP1;
      pcargop.this.AV9Procod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Procod = AV8Disartcod ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcargop.this.A396EmprCod;
      this.aP1[0] = pcargop.this.AV8Disartcod;
      this.aP2[0] = pcargop.this.AV9Procod;
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
   private String AV8Disartcod ;
   private String AV9Procod ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
}

