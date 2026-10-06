package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.numerodeprogramaautomata", "/app.formulaciontinte.numerodeprogramaautomata"})
@jakarta.servlet.annotation.MultipartConfig
public final  class numerodeprogramaautomata extends GXWebObjectStub
{
   public numerodeprogramaautomata( )
   {
   }

   public numerodeprogramaautomata( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( numerodeprogramaautomata.class ));
   }

   public numerodeprogramaautomata( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new numerodeprogramaautomata_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new numerodeprogramaautomata_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Numero de Programa Automata";
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

