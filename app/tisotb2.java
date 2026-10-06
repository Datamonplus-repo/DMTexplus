package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tisotb2", "/app.tisotb2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tisotb2 extends GXWebObjectStub
{
   public tisotb2( )
   {
   }

   public tisotb2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tisotb2.class ));
   }

   public tisotb2( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tisotb2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tisotb2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TABLA RIESGOS (ISO)";
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

