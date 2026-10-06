package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.eliminaciondeformulastinte_4exportcsv", "/app.formulaciontinte.eliminaciondeformulastinte_4exportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class eliminaciondeformulastinte_4exportcsv extends GXWebObjectStub
{
   public eliminaciondeformulastinte_4exportcsv( )
   {
   }

   public eliminaciondeformulastinte_4exportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( eliminaciondeformulastinte_4exportcsv.class ));
   }

   public eliminaciondeformulastinte_4exportcsv( int remoteHandle ,
                                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new eliminaciondeformulastinte_4exportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new eliminaciondeformulastinte_4exportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Eliminacionde Formulas Tinte_4 Export CSV";
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

