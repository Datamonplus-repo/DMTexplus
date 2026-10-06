package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcccc", "/app.tcccc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcccc extends GXWebObjectStub
{
   public tcccc( )
   {
   }

   public tcccc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcccc.class ));
   }

   public tcccc( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcccc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcccc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Codigos Control Calidad Cuardeno Encargos CC";
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

