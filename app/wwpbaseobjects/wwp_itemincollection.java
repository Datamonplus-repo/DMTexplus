package app.wwpbaseobjects ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wwp_itemincollection extends GXProcedure
{
   public wwp_itemincollection( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwp_itemincollection.class ), "" );
   }

   public wwp_itemincollection( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              GXSimpleCollection<String> aP1 )
   {
      wwp_itemincollection.this.aP2 = new boolean[] {false};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        GXSimpleCollection<String> aP1 ,
                        boolean[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             GXSimpleCollection<String> aP1 ,
                             boolean[] aP2 )
   {
      wwp_itemincollection.this.AV8Item = aP0;
      wwp_itemincollection.this.AV9Collection = aP1;
      wwp_itemincollection.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( AV9Collection.indexof(AV8Item) > 0 )
      {
         AV10IsContained = true ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = wwp_itemincollection.this.AV10IsContained;
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
   private boolean AV10IsContained ;
   private String AV8Item ;
   private boolean[] aP2 ;
   private GXSimpleCollection<String> AV9Collection ;
}

