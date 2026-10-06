package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.procesoquimico_1wwexportcsv", "/app.formulaciontinte.procesoquimico_1wwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class procesoquimico_1wwexportcsv extends GXWebObjectStub
{
   public procesoquimico_1wwexportcsv( )
   {
   }

   public procesoquimico_1wwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( procesoquimico_1wwexportcsv.class ));
   }

   public procesoquimico_1wwexportcsv( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new procesoquimico_1wwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new procesoquimico_1wwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Proceso Quimico_1 WWExport CSV";
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

