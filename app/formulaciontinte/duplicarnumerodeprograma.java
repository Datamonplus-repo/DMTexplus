package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.duplicarnumerodeprograma", "/app.formulaciontinte.duplicarnumerodeprograma"})
@jakarta.servlet.annotation.MultipartConfig
public final  class duplicarnumerodeprograma extends GXWebObjectStub
{
   public duplicarnumerodeprograma( )
   {
   }

   public duplicarnumerodeprograma( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( duplicarnumerodeprograma.class ));
   }

   public duplicarnumerodeprograma( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new duplicarnumerodeprograma_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new duplicarnumerodeprograma_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Duplicar Numero de Programa";
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

