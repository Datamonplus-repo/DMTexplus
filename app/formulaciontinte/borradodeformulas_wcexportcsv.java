package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.borradodeformulas_wcexportcsv", "/app.formulaciontinte.borradodeformulas_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class borradodeformulas_wcexportcsv extends GXWebObjectStub
{
   public borradodeformulas_wcexportcsv( )
   {
   }

   public borradodeformulas_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( borradodeformulas_wcexportcsv.class ));
   }

   public borradodeformulas_wcexportcsv( int remoteHandle ,
                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new borradodeformulas_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new borradodeformulas_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Borradode Formulas_WCExport CSV";
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

