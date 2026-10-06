package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.uti118_sdt_2exportcsv", "/app.uti118_sdt_2exportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class uti118_sdt_2exportcsv extends GXWebObjectStub
{
   public uti118_sdt_2exportcsv( )
   {
   }

   public uti118_sdt_2exportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( uti118_sdt_2exportcsv.class ));
   }

   public uti118_sdt_2exportcsv( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new uti118_sdt_2exportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new uti118_sdt_2exportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe";
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

