package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.eliminaciondeformulastinte_2exportcsv", "/app.formulaciontinte.eliminaciondeformulastinte_2exportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class eliminaciondeformulastinte_2exportcsv extends GXWebObjectStub
{
   public eliminaciondeformulastinte_2exportcsv( )
   {
   }

   public eliminaciondeformulastinte_2exportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( eliminaciondeformulastinte_2exportcsv.class ));
   }

   public eliminaciondeformulastinte_2exportcsv( int remoteHandle ,
                                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new eliminaciondeformulastinte_2exportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new eliminaciondeformulastinte_2exportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Eliminacionde Formulas Tinte_2 Export CSV";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

