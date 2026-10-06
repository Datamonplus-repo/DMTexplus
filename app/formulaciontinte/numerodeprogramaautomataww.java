package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.numerodeprogramaautomataww", "/app.formulaciontinte.numerodeprogramaautomataww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class numerodeprogramaautomataww extends GXWebObjectStub
{
   public numerodeprogramaautomataww( )
   {
   }

   public numerodeprogramaautomataww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( numerodeprogramaautomataww.class ));
   }

   public numerodeprogramaautomataww( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new numerodeprogramaautomataww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new numerodeprogramaautomataww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Numero de Programa Automata";
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

