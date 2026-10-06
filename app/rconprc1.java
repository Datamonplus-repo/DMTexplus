package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rconprc1", "/app.rconprc1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rconprc1 extends GXWebObjectStub
{
   public rconprc1( )
   {
   }

   public rconprc1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rconprc1.class ));
   }

   public rconprc1( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rconprc1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rconprc1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CONSULTA PRODUCCION P/CLIENTE";
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

