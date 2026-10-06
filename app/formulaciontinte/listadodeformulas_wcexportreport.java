package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.listadodeformulas_wcexportreport", "/app.formulaciontinte.listadodeformulas_wcexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadodeformulas_wcexportreport extends GXWebObjectStub
{
   public listadodeformulas_wcexportreport( )
   {
   }

   public listadodeformulas_wcexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadodeformulas_wcexportreport.class ));
   }

   public listadodeformulas_wcexportreport( int remoteHandle ,
                                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadodeformulas_wcexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadodeformulas_wcexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listadode Formulas_WCExport Report";
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

