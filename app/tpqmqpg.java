package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpqmqpg", "/app.tpqmqpg"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpqmqpg extends GXWebObjectStub
{
   public tpqmqpg( )
   {
   }

   public tpqmqpg( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpqmqpg.class ));
   }

   public tpqmqpg( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpqmqpg_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpqmqpg_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PQUIMICOS F(MAQUINA) PROGRAMAS";
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

