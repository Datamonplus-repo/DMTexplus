package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpll", "/app.tpll"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpll extends GXWebObjectStub
{
   public tpll( )
   {
   }

   public tpll( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpll.class ));
   }

   public tpll( int remoteHandle ,
                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpll_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpll_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Pedidos Lindalana";
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

