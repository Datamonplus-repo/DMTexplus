package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trabajosexternos.rexp100", "/app.trabajosexternos.rexp100"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rexp100 extends GXWebObjectStub
{
   public rexp100( )
   {
   }

   public rexp100( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rexp100.class ));
   }

   public rexp100( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rexp100_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rexp100_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "INFORME TRABAJOS EXTERNOS";
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

