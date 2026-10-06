package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.eliminaciondeformulastinte_1", "/app.formulaciontinte.eliminaciondeformulastinte_1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class eliminaciondeformulastinte_1 extends GXWebObjectStub
{
   public eliminaciondeformulastinte_1( )
   {
   }

   public eliminaciondeformulastinte_1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( eliminaciondeformulastinte_1.class ));
   }

   public eliminaciondeformulastinte_1( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new eliminaciondeformulastinte_1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new eliminaciondeformulastinte_1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Eliminacion de Formulas Tinte";
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

