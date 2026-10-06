package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.eliminaciondeformulastinte_4exportreport", "/app.formulaciontinte.eliminaciondeformulastinte_4exportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class eliminaciondeformulastinte_4exportreport extends GXWebObjectStub
{
   public eliminaciondeformulastinte_4exportreport( )
   {
   }

   public eliminaciondeformulastinte_4exportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( eliminaciondeformulastinte_4exportreport.class ));
   }

   public eliminaciondeformulastinte_4exportreport( int remoteHandle ,
                                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new eliminaciondeformulastinte_4exportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new eliminaciondeformulastinte_4exportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Eliminacion de Formulas Tinte";
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

