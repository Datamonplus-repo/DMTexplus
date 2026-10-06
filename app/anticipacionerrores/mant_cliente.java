package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.anticipacionerrores.mant_cliente", "/app.anticipacionerrores.mant_cliente"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mant_cliente extends GXWebObjectStub
{
   public mant_cliente( )
   {
   }

   public mant_cliente( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mant_cliente.class ));
   }

   public mant_cliente( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mant_cliente_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mant_cliente_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MAnt_Cliente";
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

