package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pset_validartipocampo extends GXProcedure
{
   public pset_validartipocampo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pset_validartipocampo.class ), "" );
   }

   public pset_validartipocampo( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             short aP2 )
   {
      pset_validartipocampo.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        short aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             short aP2 ,
                             String[] aP3 )
   {
      pset_validartipocampo.this.AV12CCTLinTpoDat = aP0;
      pset_validartipocampo.this.AV11CCTLinTpoIng = aP1;
      pset_validartipocampo.this.AV9CCTLinLgoDat = aP2;
      pset_validartipocampo.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Regex = "" ;
      if ( ( GXutil.strcmp(AV12CCTLinTpoDat, "F") == 0 ) && ( GXutil.strcmp(AV11CCTLinTpoIng, httpContext.getMessage( "R", "")) == 0 ) )
      {
         AV10Regex = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]|(?:Jan|Mar|May|Jul|Aug|Oct|Dec)))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2]|(?:Jan|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec))\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)(?:0?2|(?:Feb))\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9]|(?:Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep))|(?:1[0-2]|(?:Oct|Nov|Dec)))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$" ;
      }
      else if ( ( GXutil.strcmp(AV12CCTLinTpoDat, "N") == 0 ) && ( GXutil.strcmp(AV11CCTLinTpoIng, httpContext.getMessage( "R", "")) == 0 ) )
      {
         AV10Regex = GXutil.format( "(^[0-9]{%1}$)", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9CCTLinLgoDat), 3, 0), "", "", "", "", "", "", "", "") ;
         System.out.println( httpContext.getMessage( "numerico: ", "")+AV10Regex );
      }
      else if ( ( GXutil.strcmp(AV12CCTLinTpoDat, "H") == 0 ) && ( GXutil.strcmp(AV11CCTLinTpoIng, httpContext.getMessage( "R", "")) == 0 ) )
      {
         AV10Regex = "^(?:(?:([01]?\\d|2[0-3]):)?([0-5]?\\d):)?([0-5]?\\d)$" ;
         System.out.println( httpContext.getMessage( "hora: ", "")+AV10Regex );
      }
      else if ( ( GXutil.strcmp(AV12CCTLinTpoDat, "C") == 0 ) && ( GXutil.strcmp(AV11CCTLinTpoIng, httpContext.getMessage( "R", "")) == 0 ) )
      {
         AV10Regex = GXutil.format( "(^[A-Za-z]{%1}$)", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9CCTLinLgoDat), 3, 0), "", "", "", "", "", "", "", "") ;
         System.out.println( httpContext.getMessage( "character: ", "")+AV10Regex );
      }
      else if ( ( GXutil.strcmp(AV12CCTLinTpoDat, "T") == 0 ) && ( GXutil.strcmp(AV11CCTLinTpoIng, httpContext.getMessage( "R", "")) == 0 ) )
      {
         AV10Regex = GXutil.format( "(^[A-Za-z]{%1}$)", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9CCTLinLgoDat), 3, 0), "", "", "", "", "", "", "", "") ;
         System.out.println( httpContext.getMessage( "titulo: ", "")+AV10Regex );
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = pset_validartipocampo.this.AV10Regex;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Regex = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV9CCTLinLgoDat ;
   private short Gx_err ;
   private String AV12CCTLinTpoDat ;
   private String AV11CCTLinTpoIng ;
   private String AV10Regex ;
   private String[] aP3 ;
}

